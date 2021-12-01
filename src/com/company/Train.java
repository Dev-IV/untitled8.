package com.company;

import untitled10.Locomotive.Locomotive;
import untitled9.Carriage.RailwayCarriage;


public class Train {


    private static int counter = -1;
    private int id;
    private final String name;
    Locomotive locomotive;
    CompositionOfWagons composition;

    Train(String name, Locomotive locomotive, CompositionOfWagons composition) {
        counter++;
        id = counter;

        this.name = name;
        this.locomotive = locomotive;
        this.composition = composition;
    }

    Train(Train train) {
        this.name = train.name;
        this.locomotive = train.locomotive;
        this.composition = train.composition;
    }

    int startMoving() {
        if (locomotive.getPower() >= composition.getWeight()) {
            if(locomotive.pull()){
                System.out.println("The train began to move");
                return 1;
            }
            else{
                System.out.println("Something is wrong with the power supply");
                return 0;
            }
        } else {
            System.out.println("Train cannot start moving, the locomotive does not have enough power");
            return 2;
        }
    }

    void unhookSomeCarriage(int numberOfCarriage) {

        if(composition.getRailwayCarriages()[numberOfCarriage] != null) {
            RailwayCarriage[] newRailwayCarriage = new RailwayCarriage[composition.getRailwayCarriages().length - 1];

            for (int i = 0; i < numberOfCarriage - 1; i++) {
                newRailwayCarriage[i] = composition.getRailwayCarriages()[i];
            }

            for (int i = numberOfCarriage; i < composition.getRailwayCarriages().length; i++) {
                newRailwayCarriage[i] = newRailwayCarriage[i];
            }

            composition.setRailwayCarriages(newRailwayCarriage);
        }

        else {
            System.out.println("В поезде нет вагонов");
        }
    }

    void unhookLastCarriage() {
        if(composition.getRailwayCarriages() != null) {
            RailwayCarriage[] newRailwayCarriage = new RailwayCarriage[composition.getRailwayCarriages().length - 1];

            for(int i = 0; i < newRailwayCarriage.length; i++) {
                newRailwayCarriage[i] = composition.getRailwayCarriages()[i];
            }

            composition.setRailwayCarriages(newRailwayCarriage);
        }

        else {
            System.out.println("В поезде нет вагонов");
        }
    }

    void changeLocomotive(Locomotive newLocomotive) {
        locomotive = newLocomotive;
        System.out.println("Заменен локомотив");
    }

    void changeComposition(CompositionOfWagons newComposition) {
        composition = newComposition;
        System.out.println("Состав заменен");
    }

}
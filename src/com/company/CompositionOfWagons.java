package com.company;

import untitled9.Carriage.RailwayCarriage;

public class CompositionOfWagons {
    private static int counter = -1;
    private int id;
    private RailwayCarriage[] railwayCarriages;
    private int weight;

    CompositionOfWagons() {
        counter++;
        id = counter;
    }


    void attachTheCarriage(RailwayCarriage someCarriage) {

        if(railwayCarriages != null) {
            RailwayCarriage[] newRailwayCarriage = new RailwayCarriage[this.railwayCarriages.length + 1];

            for (int i = 0; i < this.railwayCarriages.length; i++) {
                newRailwayCarriage[i] = this.railwayCarriages[i];
            }
            newRailwayCarriage[newRailwayCarriage.length - 1] = someCarriage;
            this.railwayCarriages = newRailwayCarriage;
            this.weight += someCarriage.getWeight();
            System.out.println("The carriage was attached to the train");
        }
        else {
            railwayCarriages = new RailwayCarriage[1];
            railwayCarriages[0] = someCarriage;
            this.weight += someCarriage.getWeight();
        }
    }

    void attachSomeNumberOfCarriages(RailwayCarriage someCarriage, int numberOfCarriages){

        if(railwayCarriages != null) {
            RailwayCarriage[] newRailwayCarriage = new RailwayCarriage[this.railwayCarriages.length + numberOfCarriages];

            for (int i = 0; i < this.railwayCarriages.length; i++) {
                newRailwayCarriage[i] = this.railwayCarriages[i];
            }

            for(int i = railwayCarriages.length; i < numberOfCarriages; i++) {
                newRailwayCarriage[i] = someCarriage;
                this.weight += someCarriage.getWeight();
            }

            this.railwayCarriages = newRailwayCarriage;
            System.out.println("The carriage was attached to the train");
        }
        else {
            railwayCarriages = new RailwayCarriage[numberOfCarriages];
            for (int i = 0; i < this.railwayCarriages.length; i++) {
                railwayCarriages[i] = someCarriage;
                this.weight += someCarriage.getWeight();
            }
        }
    }

    public int getWeight() {
        return weight;
    }

    public RailwayCarriage[] getRailwayCarriages() {
        return railwayCarriages;
    }

    public void setRailwayCarriages(RailwayCarriage[] railwayCarriages) {
        this.railwayCarriages = railwayCarriages;
    }
}


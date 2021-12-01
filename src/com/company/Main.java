package com.company;


import untitled10.Locomotive.DieselLocomotive;
import untitled9.Carriage.CoveredСarriage;

public class Main {

    public static void main(String[] args) {
        CompositionOfWagons firstComposition = new CompositionOfWagons();
        CoveredСarriage carriage_1 = new CoveredСarriage(33);
        firstComposition.attachTheCarriage(carriage_1);

        DieselLocomotive sibir = new DieselLocomotive("Sibir\'", 1000, 5000, 1000);

        Train trainPutin = new Train("Putin", sibir, firstComposition);

        Station stationNovosibirsk = new Station("Novosibirsk");

        Station stationKemerovo = new Station("Kemerovo");

        System.out.println(stationKemerovo.getId());

        stationNovosibirsk.addTrainToStation(trainPutin);

        Flight flightFromNovToKemerovo = new Flight(stationNovosibirsk, stationKemerovo, trainPutin);

        flightFromNovToKemerovo.makeFlight();
    }
}

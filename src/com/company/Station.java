package com.company;

public class Station {

    private static int counter = -1;
    private int id;
    private String name;
    Train[] trainsOfStation;

    Station(String name, Train[] trainsOfStation) {
        counter++;
        id = counter;
        this.name = name;
        this.trainsOfStation = trainsOfStation.clone();
    }

    Station(Station station){
        this.name = station.name;
        if(station.trainsOfStation != null) {
            this.trainsOfStation = station.trainsOfStation.clone();
        }
    }

    Station(String name){
        counter++;
        id = counter;
        this.name = name;
    }

    void addTrainToStation(Train train){
        if(trainsOfStation != null) {
            Train[] newTrainsOfStation =  new Train[trainsOfStation.length + 1];

            for(int counter = 0; counter < trainsOfStation.length; counter++){
                newTrainsOfStation[counter] = trainsOfStation[counter];
            }
            newTrainsOfStation[trainsOfStation.length] = train;
            trainsOfStation = newTrainsOfStation;
        }
        else {
            trainsOfStation = new Train[1];
            trainsOfStation[0] = train;
        }

    }

    int getId(){
        return id;
    }

    String getName() {
        return name;
    }

    Train[] getTrainsOfStation(){
        return trainsOfStation;
    }
}
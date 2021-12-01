package com.company;

import java.util.Date;

public class Flight {

    private static int counter = -1;
    private int id;
    private int id_start_station;
    private int id_finish_station;
    private int distance;
    Train train;
    Station startStation;
    Station finishStation;
    private String date_of_arrival;
    private String date_of_departure;

    Flight(Station startStation, Station finishStation, Train train) {
        id++;
        this.startStation = new Station(startStation);
        this.finishStation = new Station(finishStation);
        this.train = new Train(train);
    }

    boolean getReadyForFlight() {
        if(train.composition.getWeight() == 0) {
            System.out.println("Nothing to transport");
            return false;
        }
        else if(train.startMoving() == 1) {
            System.out.println("Train is ok, ready for flight");
            return true;
        }
        else { return false;}
    }

    void makeFlight(){

        if(getReadyForFlight()) {

            Date date = new Date();
            counter++;
            id = counter;
            train.locomotive.powerConsumption();
            id_start_station = startStation.getId();
            date_of_departure = date.toString();

            id_finish_station = finishStation.getId();
            date_of_arrival = date.toString();

            System.out.println("Flight from " + startStation.getName() + " to " + finishStation.getName() + ". " +
                    "Date of departure: " + date_of_departure + ", Date of arrival: " + date_of_arrival);
        }
        else {
            System.out.println("Cannot make a flight, something is wrong");
        }
    }

    private void cancelFlight(){
        System.out.println("The flight was cancelled");
    }

    String getDate_of_arrival(){
        return date_of_arrival;
    }

    String getDate_of_departure(){
        return date_of_departure;
    }

    String getNameStartStation(){
        return startStation.getName();
    }

    String getNameFinishStation(){
        return finishStation.getName();
    }
}
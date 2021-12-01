package untitled11.Employe;

public class StationAttendant extends Employee{
    private static Positions position = Positions.stationAttendant;

    public StationAttendant(String name, double salary) {
        super(name, position, salary);
    }

    void makeSchedule() {

    }

    void sendTrain() {
        System.out.println("Sending the train");
    }

    void takeTheTrain() {
        System.out.println("Train taking");
    }

}
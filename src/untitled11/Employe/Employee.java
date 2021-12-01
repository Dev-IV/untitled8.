package untitled11.Employe;

public abstract class Employee {

    protected static enum Positions {
        stationAttendant,
        dispatcher,
        servicePersonnel,
        trackCrawlers,
        inspectorsRepairmen,
        electrician,
        machinist,
        trainChief,
        conductor
    }

    private static int counter = -1;
    private int id;
    private String name;
    private Positions position;
    private double salary;

    public Employee(String name, Positions position, double salary){
        counter++;
        id = counter;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}
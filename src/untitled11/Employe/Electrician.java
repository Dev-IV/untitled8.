package untitled11.Employe;

public class Electrician extends Employee{
    private static Positions position = Positions.electrician;

    public Electrician(String name, double salary) {
        super(name, position, salary);
    }

    void monitoringTheElectricalEquipment() {

    }

}
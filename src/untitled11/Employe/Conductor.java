package untitled11.Employe;

public class Conductor extends Employee{
    private static Positions position = Positions.conductor;

    public Conductor(String name, double salary) {
        super(name, position, salary);
    }

    void takeCareOfPassengers() {

    }
}

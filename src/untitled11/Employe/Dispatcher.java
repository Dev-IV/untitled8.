package untitled11.Employe;

public class Dispatcher extends Employee{
    private static Positions position = Positions.dispatcher;

    public Dispatcher(String name, double salary) {
        super(name, position, salary);
    }

    void coordinateTrainsMovement() {

    }

}
package untitled11.Employe;

public class Machinist extends Employee{
    private static Positions position = Positions.machinist;

    public Machinist(String name, double salary) {
        super(name, position, salary);
    }

    void TrainMovementMonitoring() {

    }

}
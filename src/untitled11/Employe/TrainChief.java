package untitled11.Employe;

public class TrainChief extends Employee{
    private static Positions position = Positions.trainChief;

    public TrainChief(String name, double salary) {
        super(name, position, salary);
    }

    void monitorTheTechnicalCondition() {

    }

}

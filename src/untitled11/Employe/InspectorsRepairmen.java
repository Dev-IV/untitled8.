package untitled11.Employe;

public class InspectorsRepairmen extends Employee {
    private static Positions position = Positions.inspectorsRepairmen;

    public InspectorsRepairmen(String name, double salary) {
        super(name, position, salary);
    }

    void monitoringTheCondition() {

    }
}
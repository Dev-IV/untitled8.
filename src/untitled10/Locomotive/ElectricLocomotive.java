package untitled10.Locomotive;

public class ElectricLocomotive extends Locomotive {

    public ElectricLocomotive(String name, int power) {
        super(name, power);
    }

    @Override
    public boolean pull() {

        System.out.println("The locomotive pulls");
        return true;
    }

    @Override
    public void powerConsumption() {
        System.out.println("A lot of electricity is used");
    }
}
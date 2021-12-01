package untitled10.Locomotive;

public class DieselLocomotive extends Locomotive {
    private int tankCapacity;
    private int fuelInTheTank;
    private int fuelConsumption;
    public DieselLocomotive(String name, int power ,int tankCapacity, int fuelConsumption) {
        super(name, power);
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean pull() {
        if(tankCapacity < fuelInTheTank) {
            System.out.println("There is not enough fuel for the road, you need refueling");
            return false;
        }
        else{
            System.out.println("The locomotive is pulls");
            return true;
        }
    }

    @Override
    public void powerConsumption() {
        fuelInTheTank -= fuelConsumption;
        System.out.println(fuelConsumption + " liters of fuel was burned");
    }

    void refuel(int quantityOfFuel){
        if(fuelInTheTank + quantityOfFuel > tankCapacity)
        {
            fuelInTheTank = tankCapacity;
        }
        else {
            tankCapacity += quantityOfFuel;
        }
    }

}
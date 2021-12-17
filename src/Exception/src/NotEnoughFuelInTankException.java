public class NotEnoughFuelInTankException extends Exception {

    public NotEnoughFuelInTankException(String locomotiveName) {
        super("There is not enough fuel in locomotive with name: " + locomotiveName + " for the road, you need refueling");
    }
}
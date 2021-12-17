public class NoFreeTrainForFlightException extends RuntimeException{

    public NoFreeTrainForFlightException(String stationName) {
        super("Station: " + stationName + "have not free trains for flight");
    }
}

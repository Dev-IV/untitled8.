
    public class CannotMakeFlightException extends RuntimeException {

        public CannotMakeFlightException(int id) {
            super("Cannot make a flight with id: " + id + ", something is wrong");
        }
}

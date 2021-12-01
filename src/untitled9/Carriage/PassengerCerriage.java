package untitled9.Carriage;

    public class PassengerCerriage extends RailwayCarriage {
        private int NumberOfSeats;

        public PassengerCerriage(int weight, int numberOfSeats) {
            super(weight);
            this.NumberOfSeats = numberOfSeats;
        }
    }


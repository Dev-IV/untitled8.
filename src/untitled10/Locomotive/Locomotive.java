package untitled10.Locomotive;


    public abstract class Locomotive {

        private static int counter = -1;
        private int id;
        private int power;
        private final String locomotiveName;

        public Locomotive(String name, int power){
            counter++;
            id = counter;
            this.locomotiveName = name;
            this.power = power;
        }

        public abstract boolean pull();
        public abstract void powerConsumption();

        public int getPower(){
            return power;
        }

    }



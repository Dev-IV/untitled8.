package untitled9.Carriage;

public abstract class RailwayCarriage {

    private static int counter = -1;
    private int id;
    private int weight;

    public RailwayCarriage(int weight){
        this.weight = weight;
        counter++;
        id = counter;
    }

    public int getId(){
        return id;
    }

    public int getWeight(){
        return weight;
    }

}
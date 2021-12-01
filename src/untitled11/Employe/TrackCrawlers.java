package untitled11.Employe;

public class TrackCrawlers extends Employee{
    private static Positions position = Positions.trackCrawlers;

    public TrackCrawlers(String name, double salary) {
        super(name, position, salary);
    }

    void checkRoadwaysServiceability() {

    }
}
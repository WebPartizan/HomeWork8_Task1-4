package sputnik;

public class Sputnik {
    private String name;
    private String designator;
    private int apogee;
    private int perigee;
    private int inclination;
    private double altitude;
    private double velocity;
    private double period;

    public Sputnik(String name, String designator, int apogee, int perigee, int inclination, double altitude, double velocity, double period) {
        this.name = name;
        this.designator = designator;
        this.apogee = apogee;
        this.perigee = perigee;
        this.inclination = inclination;
        this.altitude = altitude;
        this.velocity = velocity;
        this.period = period;
    }
}

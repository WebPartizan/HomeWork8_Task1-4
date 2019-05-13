package sputnik;

import java.util.Objects;

public class Sputnik {
    private String name;
    private String intlDesignator;
    private int apogee;
    private int perigee;
    private double inclination;
    private double altitude;
    private double velocity;
    private double period;

    public Sputnik(String name, String intlDesignator, int apogee, int perigee, double inclination, double altitude, double velocity, double period) {
        this.name = name;
        this.intlDesignator = intlDesignator;
        this.apogee = apogee;
        this.perigee = perigee;
        this.inclination = inclination;
        this.altitude = altitude;
        this.velocity = velocity;
        this.period = period;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getintlDesignator() {
        return intlDesignator;
    }

    public void setintlDesignator(String intlDesignator) {
        this.intlDesignator = intlDesignator;
    }

    public int getApogee() {
        return apogee;
    }

    public void setApogee(int apogee) {
        this.apogee = apogee;
    }

    public int getPerigee() {
        return perigee;
    }

    public void setPerigee(int perigee) {
        this.perigee = perigee;
    }

    public double getInclination() {
        return inclination;
    }

    public void setInclination(int inclination) {
        this.inclination = inclination;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getPeriod() {
        return period;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sputnik sputnik = (Sputnik) o;
        return apogee == sputnik.apogee &&
                perigee == sputnik.perigee &&
                inclination == sputnik.inclination &&
                Double.compare(sputnik.altitude, altitude) == 0 &&
                Double.compare(sputnik.velocity, velocity) == 0 &&
                Double.compare(sputnik.period, period) == 0 &&
                name.equals(sputnik.name) &&
                intlDesignator.equals(sputnik.intlDesignator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, intlDesignator, apogee, perigee, inclination, altitude, velocity, period);
    }

    @Override
    public String toString() {
        return "Sputnik{" +
                "intlDesignator='" + intlDesignator + '\'' +
                ", apogee=" + apogee +
                ", perigee=" + perigee +
                ", velocity=" + velocity +
                '}';
    }
}

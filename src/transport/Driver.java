package transport;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Driver {
    private String name;
    private boolean drivingLicense;
    private int experience;

    public Driver(String name, boolean drivingLicense, int experience) {
        this.name = name;
        this.drivingLicense = drivingLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void refuel();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingLicense == driver.drivingLicense && experience == driver.experience && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, drivingLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", drivingLicense=" + drivingLicense +
                ", experience=" + experience +
                '}';
    }
}

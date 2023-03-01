package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private final Mechanic mechanic;

    public Transport(String brand, String model, double engineVolume, T driver, Mechanic mechanic) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.engineVolume = engineVolume;
        setDriver(driver);
        this.mechanic = mechanic;
    }

    public abstract Type getType();

    public abstract void printType();

    public boolean isNeedDiagnostic(Transport transport) {
        if (transport.getType() == Type.BUSES) {
            return false;
        }
        return true;
    }


    public String getBrand() {
        return brand;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
    }

    public abstract void startMove();

    public abstract void finishMove();

    public abstract void passTheDiagnostic() throws TransportTypeException;

    @Override
    public String toString() {
        return "{brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}

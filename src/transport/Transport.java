package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private final List<Mechanic> mechanicList;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechaniclist) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty() ? "default" : model);
        this.engineVolume = engineVolume;
        setDriver(driver);
        this.mechanicList = mechaniclist;
    }

    public abstract Type getType();

    public abstract void printType();

    public boolean isNeedDiagnostic(Transport<?> transport) {
        if (transport.getType() == Type.BUSES) {
            return false;
        }
        return true;
    }

    public String getBrand() {
        return brand;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "{brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}

package drivers;

import transport.*;

import java.util.Objects;

public abstract class Driver <A extends Car> {
    private final String name;

    protected boolean driverLicense;

    private int drivingExperience;

    public Driver(String name, boolean driverLicense, int drivingExperience) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Иванов Иван Иванович";
        }
        this.driverLicense = driverLicense;
        if (drivingExperience < 0) {
            this.drivingExperience = 0;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience < 0) {
            this.drivingExperience = 0;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
    public abstract void startMoving();
    public abstract void finishMoving();

    public abstract void refuel();
    public void informationOfDriverCars(Cars car) {

    }

    public void driver_DrivingCars(Cars car) {

    }

    public void informationOfDriverTrucks(Trucks truck) {

    }

    public void driver_DrivingTrucks(Trucks truck) {

    }

    public void informationOfDriverBus(Bus bus) {

    }

    public void driver_DrivingBus(Bus bus) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver<?> driver = (Driver<?>) o;
        return driverLicense == driver.driverLicense && drivingExperience == driver.drivingExperience && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, drivingExperience);
    }

    @Override
    public String toString() {
        return "drivers.Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}

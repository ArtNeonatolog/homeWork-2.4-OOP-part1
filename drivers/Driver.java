package drivers;

import transport.*;

import java.util.Objects;

public abstract class Driver <A extends PassengerCar> {
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
        if (this.driverLicense == true) {
            System.out.println("Имя водителя легкового автомобиля - " + getName() + ", водительский стаж - " + this.getDrivingExperience() + " лет, имеет действующие права категории В");
        } else {
            System.out.println("Водитель не может быть допущен к управлению автомобилем, т.к. нет водительских прав");
        }

    }
    public void driverDrivingCars(Cars car) {
        if (this.driverLicense == true) {
            System.out.println("Водитель - " + this.getName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
        }else{
            System.out.println("Водитель легкового автомобиля - " + getName() + " не допущен к соревнованиям, т.к. отсутствуют или просрочены водительские права");
        }
    }
    public void informationOfDriverTrucks(Trucks truck) {
        if (this.driverLicense == true) {
            System.out.println("Имя водителя грузового автомобиля - " + getName() + ", водительский стаж - " + getDrivingExperience() + " лет, имеет действующие права категории С");
        }else{
            System.out.println("Водитель не может быть допущен к управлению автомобилем, т.к. нет водительских прав");
        }
    }
    public void driverDrivingTrucks(Trucks truck) {
        if (this.driverLicense == true) {
            System.out.println("Водитель - " + getName() + " управляет автомобилем " + truck.getBrand() + " " + truck.getModel() + " и будет участвовать в заезде");
        }else{
            System.out.println("Водитель грузового автомобиля - " + getName() + " не допущен к соревнованиям, т.к. отсутствуют или просрочены водительские права");
        }
    }
    public void informationOfDriverBus(Bus bus) {
        if (this.driverLicense == true) {
            System.out.println("Имя водителя автобуса - " + getName() + ", водительский стаж - " + getDrivingExperience() + " лет, имеет действующие права категории D");
        }else{
            System.out.println("Водитель не может быть допущен к управлению автомобилем, т.к. нет водительских прав");
        }
    }
    public void driverDrivingBus(Bus bus) {
        if (this.driverLicense == true) {
            System.out.println("Водитель - " + getName() + " управляет автобусом " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде");
        }else{
            System.out.println("Водитель автобуса - " + getName() + " не допущен к соревнованиям, т.к. отсутствуют или просрочены водительские права");
        }
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

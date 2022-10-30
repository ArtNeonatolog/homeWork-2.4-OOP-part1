package drivers;

import transport.Cars;

public class DriverB extends Driver {

    public DriverB(String name, boolean driverLicense, int drivingExperience) {
        super(name, driverLicense, drivingExperience);
    }

    @Override
    public void startMoving() {
        System.out.println("Вставляю ключ в замок зажигания, поворачиваю, удерживаю сцепление, нажимаю педаль газа, начинаю движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Плавно нажимаю на педаль тормоза, останавливаю машину");
    }

    @Override
    public void refuel() {
        System.out.println("Если в машине бензина осталось менее чем 1/3 бака, заправляю машину");
    }

    public void informationOfDriverCars(Cars car) {
        if (super.driverLicense == true) {
            System.out.println("Имя водителя легкового автомобиля - " + getName() + ", водительский стаж - " + super.getDrivingExperience() + " лет, имеет действующие права категории В");
        } else {
            System.out.println("Водитель не может быть допущен к управлению автомобилем, т.к. нет водительских прав");
        }
    }
    public void driver_DrivingCars(Cars car) {
        if (super.driverLicense == true) {
        System.out.println("Водитель - " + super.getName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
    }else{
        System.out.println("Водитель легкового автомобиля - " + getName() + " не допущен к соревнованиям, т.к. отсутствуют или просрочены водительские права");
    }
    }

    @Override
    public String toString() {
        return "drivers.DriverB{} " + super.toString();
    }
}

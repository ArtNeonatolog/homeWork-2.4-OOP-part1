package drivers;

import transport.Trucks;
public class DriverC extends Driver {

    public DriverC(String name, boolean driverLicense, int drivingExperience) {
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

    public void driver_DrivingTrucks (Trucks truck) {
        if (this.driverLicense == true) {
        System.out.println("Водитель - " + getName() + " управляет автомобилем " + truck.getBrand() + " " + truck.getModel() + " и будет участвовать в заезде");
    }else{
        System.out.println("Водитель грузового автомобиля - " + getName() + " не допущен к соревнованиям, т.к. отсутствуют или просрочены водительские права");
    }
    }

    public void informationOfDriverTrucks (Trucks truck) {
        if (this.driverLicense == true) {
            System.out.println("Имя водителя грузового автомобиля - " + getName() + ", водительский стаж - " + getDrivingExperience() + " лет, имеет действующие права категории С");
        }else{
            System.out.println("Водитель не может быть допущен к управлению автомобилем, т.к. нет водительских прав");

        }
    }

    @Override
    public String toString() {
        return "drivers.DriverC{} " + super.toString();
    }
}

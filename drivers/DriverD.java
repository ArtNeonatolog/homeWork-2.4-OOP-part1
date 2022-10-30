package drivers;

import transport.Bus;

public class DriverD extends Driver {

    public DriverD(String name, boolean driverLicense, int drivingExperience) {
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

    public void driver_DrivingBus(Bus bus) {
        if (this.driverLicense == true) {
            System.out.println("Водитель - " + getName() + " управляет автобусом " + bus.getBrand() + " " + bus.getModel() + " и будет участвовать в заезде");
        }else{
            System.out.println("Водитель автобуса - " + getName() + " не допущен к соревнованиям, т.к. отсутствуют или просрочены водительские права");
        }
    }

    public void informationOfDriverBus(Bus bus) {
        if (this.driverLicense == true) {
            System.out.println("Имя водителя автобуса - " + getName() + ", водительский стаж - " + getDrivingExperience() + " лет, имеет действующие права категории D");
        }else{
            System.out.println("Водитель не может быть допущен к управлению автомобилем, т.к. нет водительских прав");
        }
    }

    @Override
    public String toString() {
        return "DriverD{} " + super.toString();
    }
}

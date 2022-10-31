package drivers;

import transport.Bus;
import transport.PassengerCar;
import transport.Trucks;

public class DriverD extends Driver {

    private final Bus transport;

    public DriverD(String name, boolean driverLicense, int drivingExperience, PassengerCar transport) {
        super(name, driverLicense, drivingExperience, transport);
        if (transport != null) {
            this.transport = (Bus) transport;
        } else {
            this.transport = (Bus) transport ("Икарус", "BH657", 10.0f);
        }
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

    @Override
    public String toString() {
        return "DriverD{" +
                "transport=" + transport +
                ", driverLicense=" + driverLicense +
                "} " + super.toString();
    }
}

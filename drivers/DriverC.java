package drivers;

import transport.Cars;
import transport.PassengerCar;
import transport.Trucks;
public class DriverC extends Driver {
    private final Trucks transport;

    public DriverC(String name, boolean driverLicense, int drivingExperience, PassengerCar transport) {
        super(name, driverLicense, drivingExperience,transport);
        if (transport != null) {
            this.transport = (Trucks) transport;
        } else {
            this.transport = (Trucks) transport ("Камаз", "СХ56", 18.0f);
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
        return "DriverC{" +
                "transport=" + transport +
                ", driverLicense=" + driverLicense +
                "} " + super.toString();
    }
}

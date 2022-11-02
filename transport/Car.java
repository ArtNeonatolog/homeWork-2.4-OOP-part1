package transport;

import java.util.Objects;

public class Car extends PassengerCar implements Competing {

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public final int MAX_SPEED = 300;

    @Override
    public void startMoving() {
        System.out.println("Начало движения с быстрого старта, затем максимальный разгон");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение после пересечения финиша путем быстрой остановки");
    }

    public void informationOfTheCar() {
            System.out.println(getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л.");
    }

    @Override
    public void PitStop() {
        System.out.println("Заезжать на пит-стоп через каждые 30 кругов или если начнется дождь, также при поломке");

    }

    @Override
    public void theBestTimeOfLap() {
        System.out.println("Лучшее время круга - 5 мин. 36 сек.");
    }
    @Override
    public String maxSpeed() {
        return "Максимальная скорость легковой машины в гоночных соревнованиях - " + MAX_SPEED+ " км/ч.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return MAX_SPEED == car.MAX_SPEED;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MAX_SPEED);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "MAX_SPEED=" + MAX_SPEED +
                "} " + super.toString();
    }
}

package transport;

public class Trucks extends Car implements Competing {
    public Trucks(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public final int MAX_SPEED = 150;

    @Override
    public void startMoving() {
        System.out.println("Начало движения - постепенный старт, затем быстрый разгон");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение после пересечения финишной черты медленным торможением");

    }

    public void informationOfTheTrucks() {
        System.out.println(getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л.");
    }


    @Override
    public void PitStop() {
        System.out.println("Заезжать на пит-стоп через каждые 20 кругов или если начнется дождь, также при поломке");
    }

    @Override
    public void theBestTimeOfLap() {
        System.out.println("Лучшее время круга - 9 мин. 58 сек.");

    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость грузовой машины в гоночных соревнованиях - " + MAX_SPEED + " км/ч.";
    }
}

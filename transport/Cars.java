package transport;

public class Cars extends Car {

    public Cars(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

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

}

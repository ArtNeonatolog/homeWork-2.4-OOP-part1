package transport;

public class Bus extends Car {

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Начало движения - медленный старт, затем плавный разгон");
    }

    @Override
    public void finishMoving() {
        System.out.println("Закончить движение после пересечения финишной черты постепенной остановкой");

    }

    public void informationOfTheBus() {
        System.out.println(getBrand() + " " + getModel() + ", объем двигателя - " + getEngineVolume() + " л.");
    }

    // @Override
   // public void refill() {
     //   System.out.println("Можно заправлять бензином или дизелем на заправке");
  //  }

  //  public void informationOfTheBus() {
     //   System.out.println("Автобус " + getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска" + ", сборка - " + getProductionCountry() + ", цвет кузова - " + getColor() + ", максимальная скорость - " + getMaximumSpeed() + " км/ч");
    //}
}
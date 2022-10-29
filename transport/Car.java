package transport;

import java.util.Objects;

public abstract class Car extends Transport {

    private float engineVolume;
  //  private String transmission;
   // private final String bodyType;
   // private String registrationNumber;
   // private int numberOfSeats;

    public Car(String brand, String model, float engineVolume) {
        super(brand, model);
        if (engineVolume < 0.5) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;}
    }
    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0.5) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;}
    }

    public abstract void startMoving ();

    public abstract void finishMoving ();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                "} " + super.toString();
    }
}


   // public void informationOfTheCar() {
    //    System.out.println(getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска" + ", сборка - " + getProductionCountry() + ", цвет кузова - " + getColor() + ", объем двигателя - " + getEngineVolume() + " л." +
         //       ", коробка передач - " + getTransmission() + ", тип кузова - " + getBodyType() + ", регистрационный номер - " + getRegistrationNumber() + ", количество мест - " + getNumberOfSeats());
   // }

   // @Override
    //public void refill() {
     //   System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    //}

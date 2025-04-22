package fp;

public class Car {
    String make;
    String vin;
    String owner;

    public Car(String make, String vin, String owner) {
        this.make = make;
        this.vin = vin;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return vin.equals(car.vin);
    }

    @Override
    public int hashCode() {
        return vin.hashCode();
    }

    @Override
    public String toString() {
        return "fp.Car{" +
                "make='" + make + '\'' +
                ", vin='" + vin + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}

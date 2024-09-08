abstract class Vehicle {
    String vmake;
    String vmodel;

    abstract void display();
}

abstract class FourWheeler extends Vehicle {
    int noOfDoors;

    public void setFourMake(String make) {
        this.vmake = make;
    }

    public void setFourModel(String model) {
        this.vmodel = model;
    }

    public void setFourDoors(int n) {
        this.noOfDoors = n;
    }
}

abstract class TwoWheeler extends Vehicle {
    boolean hasCarrier;

    public void setTwoMake(String make) {
        this.vmake = make;
    }

    public void setTwoModel(String model) {
        this.vmodel = model;
    }

    public void setTwoCarrier(boolean carrier) {
        this.hasCarrier = carrier;
    }
}

class Car extends FourWheeler {
    void display() {
        System.out.println("Make: " + this.vmake);
        System.out.println("Model: " + this.vmodel);
        System.out.println("No Of Doors: " + this.noOfDoors);
    }
}

class Bike extends TwoWheeler {
    void display() {
        System.out.println("Make: " + this.vmake);
        System.out.println("Model: " + this.vmodel);
        System.out.println("Has Carrier: " + this.hasCarrier);
    }
}

public class HybridInheritanceAbstract {
    public static void main(String args[]) {

        Car car = new Car();
        car.setFourMake("Honda");
        car.setFourModel("Civic");
        car.setFourDoors(4);

        Bike bike = new Bike();
        bike.setTwoMake("Suzuki");
        bike.setTwoModel("Hayabusa");
        bike.setTwoCarrier(false);

        System.out.println("Car Details: ");
        car.display();

        System.out.println("Bike Details: ");
        bike.display();
    }
}
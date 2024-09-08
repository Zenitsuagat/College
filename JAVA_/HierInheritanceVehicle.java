import java.util.Scanner;

class Vehicle{
    String vmake;
    String vmodel;
}

class Car extends Vehicle{
    int numberOfDoors;

    public void setCarMake(String make){
        this.vmake = make;
    }

    public void setCarModel(String model){
        this.vmodel = model;
    }

    public void setCarDoors(int n){
        this.numberOfDoors = n;
    }
}

class Bike extends Vehicle{
    String bType;

    public void setBikeMake(String make){
        this.vmake = make;
    }

    public void setBikeModel(String model){
        this.vmodel = model;
    }

    public void setBikeType(String type){
        this.bType = type;
    }
}

class HierInheritanceVehicle{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Car obj1 = new Car();
        Bike obj2 = new Bike();

        System.out.print("Enter the make of car : ");
        String cmake = input.nextLine();
        obj1.setCarMake(cmake);
        System.out.print("Enter the model of car : ");
        String cmodel = input.nextLine();
        obj1.setCarModel(cmodel);
        System.out.print("Enter the number of doors : ");
        int doors = input.nextInt();
        input.nextLine();
        obj1.setCarDoors(doors);

        System.out.print("Enter the make of Bike : ");
        String bmake = input.nextLine();
        obj2.setBikeMake(bmake);
        System.out.print("Enter the model of Bike : ");
        String bmodel = input.nextLine();
        obj2.setBikeModel(bmodel);
        System.out.print("Enter the type : ");
        String type = input.nextLine();
        obj2.setBikeType(type);

        System.out.println("Car Make : "+obj1.vmake);
        System.out.println("Car Model : "+obj1.vmodel);
        System.out.println("No Of Doors : "+obj1.numberOfDoors);

        System.out.println("Bike Make : "+obj2.vmake);
        System.out.println("Bike Model : "+obj2.vmodel);
        System.out.println("Type : "+obj2.bType);
    }
}
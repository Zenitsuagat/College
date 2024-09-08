import java.util.Scanner;

class Cars{
    String make;
    String model;
    int year;
    double price;

    Cars(String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void display(){
        System.out.println("\nInfo OF Car : ");
        System.out.println("Make : "+this.make);
        System.out.println("Model : "+this.model);
        System.out.println("Year : "+this.year);
        System.out.println("Price : $"+this.price);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter info of Car : ");
        System.out.print("Enter car Make : ");
        String make = input.nextLine();

        System.out.print("Enter car Model : ");
        String model = input.nextLine();

        System.out.print("Enter car year : ");
        int year = input.nextInt();

        input.nextLine();

        System.out.print("Enter car price : ");
        double price = input.nextDouble();


        Cars car = new Cars(make,model,year,price);
        car.display();
        
    }
}
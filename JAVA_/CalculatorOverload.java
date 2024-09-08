import java.util.Scanner;

class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }
}

class CalculatorOverload{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer : ");
        int a = input.nextInt();
        System.out.print("Enter a integer : ");
        int b = input.nextInt();
        System.out.print("Enter a integer : ");
        int c = input.nextInt();
        System.out.print("Enter a double : ");
        double d1 = input.nextDouble();
        System.out.print("Enter a double : ");
        double d2 = input.nextDouble();

        Calculator obj = new Calculator();

        int r1 = obj.add(a, b);
        int r2 = obj.add(a, b, c);
        double r3 = obj.add(d1, d2);

        System.out.println("Addition of two integers : "+r1);
        System.out.println("Addition of three integers : "+r2);
        System.out.println("Addition of two doubles : "+r3);
    }
}
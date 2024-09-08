import java.util.Scanner;

class q5{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Fahrenheit : ");
        float f = input.nextFloat();

        float c = (f - 32) * 5 / 9;

        System.out.println("Celsius : "+c);
    }
}
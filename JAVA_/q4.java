import java.util.Scanner;

class q4{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first value : ");
        int a = input.nextInt();
        input.nextLine();
        System.out.print("Enter the second value : ");
        int b = input.nextInt();

        System.out.println("First Value : "+a+"\t"+"Second Value : "+b);
        System.out.println("After Swapping : ");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("First Value : "+a+"\t"+"Second Value : "+b);
    }
}
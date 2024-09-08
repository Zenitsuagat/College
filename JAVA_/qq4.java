import java.util.Scanner;

class q4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You are eligible for Voting");
        }
        else{
            System.out.println("You are not eligible for Voting");
        }
    }
}
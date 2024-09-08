import java.util.Scanner;
import java.util.Random;

class MultiplicationRandom{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Multiplication Practice Program!");

        while (true){
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(10) + 1;

            System.out.println("What is "+a+"*"+b+"?");
            System.out.print("Enter your answer (or 0 to exit) : ");
            int ans = input.nextInt();

            if(ans == 0){
                System.out.println("Thank you for practicing multiplication!");
                break;
            }

            int correct_ans = a * b;

            if(ans == correct_ans){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Incorrect. The correct answer is "+correct_ans);
            }
        }
    }
}
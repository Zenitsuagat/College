import java.util.Scanner;
import java.util.Random;

class RandomGuessing{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guessing Game!");

        while (true){
            int a = random.nextInt(100) + 1;

            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("Can you guess what it is?");
            System.out.print("Enter your guess : ");
            int b = input.nextInt();

            if(a > b){
                System.out.println("Too Low");
            }
            else if(a < b){
                System.out.println("Too High");
            }
            else{
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            }
        }
    }
}
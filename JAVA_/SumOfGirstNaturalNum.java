import java.util.Scanner;

class SumOfFirstNaturalNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter a positive integer : ");
        int n = input.nextInt();
        for(int i = 1;i <= n;i++){
            sum += i;
        }
        System.out.println("Sum of First "+n+" natural number : "+sum);
    }
}
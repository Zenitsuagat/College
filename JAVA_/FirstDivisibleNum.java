import java.util.Scanner;

class FirstDivisibleNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the upper limit : ");
        int r = input.nextInt();
        System.out.print("Enter the divisor : ");
        int n = input.nextInt();

        for(int i=2;i<=r;i++){
            if(n%i == 0){
                System.out.println("The first number divisible by "+n+" is "+i);
             
                break;
            }
        }
    }
}
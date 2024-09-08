import java.util.Scanner;

class PascalsTriangle{
    public int factorial(int i){
        if(i==0){
            return 1;
        }
        return i*factorial(i-1);
    }
    public static void main(String[] args){
        PascalsTrinagle a = new PascalsTrinagle();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle : ");
        int n = input.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+a.factorial(i)/(a.factorial(i-j)*a.factorial(j)));
            }
            System.out.println();
        }
    }
}
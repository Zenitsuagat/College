import java.util.Scanner;

class MultiplicationTable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table : ");
        int n = input.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
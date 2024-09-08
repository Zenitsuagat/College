import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		int fact = 1;
		while(n >= 1){
			fact *= n;
			n -= 1;
		}
		System.out.println("Factorial : "+fact);
	}
}
 
import java.util.Scanner;

class UserAuthentication{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String cp = "secret123";

        while(true){
            System.out.print("Enter password : ");
            String up = input.nextLine();

            if(cp.equals(up)){
                System.out.println("Password accepted.");
                break;
            }
            else{
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
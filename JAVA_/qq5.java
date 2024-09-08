import java.util.Scanner;

class q5{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark : ");
        float mark = input.nextFloat();

        String result = (mark >= 50)?"Pass":"Fail";
        System.out.println(result);
    }
}
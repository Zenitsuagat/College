import java.util.Scanner;
class q2{
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the Student : ");
        String name = input.nextLine();
        System.out.print("Enter the RollNumber of the Student : ");
        int rollno = input.nextInt();
        System.out.print("Enter the Age of the Student : ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter DOB of the Student : ");
        String dob = input.nextLine();
        System.out.print("Enter Blood Group of the Student : ");
        char bg = input.next().charAt(0);
        System.out.print("Enter the Height of the Student : ");
        float h = input.nextFloat();
        System.out.print("Enter the Weight of the Student : ");
        float w = input.nextFloat();
        input.nextLine();
        System.out.print("Enter the Father's name of the Student : ");
        String fname = input.nextLine();
        System.out.print("Enter the Mother's name of the Student : ");
        String mname = input.nextLine();
        System.out.print("Enter the Address of the Student : ");
        String addr = input.nextLine();

        System.out.println("----------------------------------------------");
        System.out.println("Student BioData");
        System.out.println("Student Name :"+"\t"+name);
        System.out.println("Student Roll Number :"+"\t"+rollno);
        System.out.println("Student Age :"+"\t"+age);
        System.out.println("Student DOB :"+"\t"+dob);
        System.out.println("Student Blood Group :"+"\t"+bg);
        System.out.println("Student Height :"+"\t"+h);
        System.out.println("Student Weight :"+"\t"+w);
        System.out.println("Student Father's Name :"+"\t"+fname);
        System.out.println("Student Mother's Name :"+"\t"+mname);
        System.out.println("Student Address :"+"\t"+addr);

        
    }
}
import java.util.Scanner;

class Student{
    String sname;
    double hgrade;
    double fgrade;

    Student(String sname, double hgrade, double fgrade){
        this.sname = sname;
        this.hgrade = hgrade;
        this.fgrade = fgrade;
    }

    double gradeAvg(){
        return (this.hgrade + this.fgrade) / 2.0;
    }
}

public class GradeManager{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of student : ");
        String name = input.nextLine();

        System.out.print("Enter the homework grade : ");
        double hg = input.nextDouble();

        input.nextLine();

        System.out.print("Enter the final exam grade : ");
        double fg = input.nextDouble();

        Student stu = new Student(name,hg,fg);
        double result = stu.gradeAvg();

        System.out.println("Average : "+result);
    }
}
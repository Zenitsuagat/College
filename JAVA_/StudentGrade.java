import java.util.Scanner;

class Student{
    private int grade;

    public void setGrade(int grade){
        if(grade >= 0 && grade <= 100){
            this.grade = grade;
        }
        else{
            System.out.println("Invalid grade");
        }
    }

    public int getGrade(){
        return this.grade;
    }
}

class StudentGrade{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter the grade to set : ");
        s.setGrade(input.nextInt());
        int result  = s.getGrade();
        System.out.println("Final Grade : "+result);
    }
}
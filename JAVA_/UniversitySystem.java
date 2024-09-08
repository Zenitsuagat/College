import java.util.Scanner;

class Student{
    private String stuName;
    private int stuID;
    static int noOfStuenrolled = 0;

    Student(String stuName, int stuID){
        this.stuName = stuName;
        this.stuID = stuID;
        noOfStuenrolled++;
    }

    public static void getTotalStudentsEnrolled(){
        System.out.println("Total Students Enrolled : "+noOfStuenrolled);
    }
}

class Course{
    private String cTitle;
    private String cCode;
    static int tolNoOfCoures = 0;

    Course(String cTitle, String cCode){
        this.cTitle = cTitle;
        this.cCode = cCode;
        tolNoOfCoures++;
    }

    public static void getTotalCoursesOffered(){
        System.out.println("Total Courses Offered : "+tolNoOfCoures);
    }
}

class UniversitySystem{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no of students : ");
        int snum = input.nextInt();
        input.nextLine();

        Student[] students = new Student[snum];
        for(int i=0;i<snum;i++){
            System.out.println("Enter the Info of Student "+(i+1));
            System.out.print("Name : ");
            String name = input.nextLine();
            System.out.print("ID : ");
            int id = input.nextInt();
            input.nextLine();
            
            students[i] = new Student(name, id);
        }

        System.out.print("Enter the number of Courses : ");
        int cnum = input.nextInt();
        input.nextLine();

        Course[] courses = new Course[cnum];
        for(int i=0;i<cnum;i++){
            System.out.println("Enter the info of course "+(i+1));
            System.out.print("Title : ");
            String title = input.nextLine();
            System.out.print("Code : ");
            String code = input.nextLine();

            courses[i] = new Course(title, code);
        }

        Student.getTotalStudentsEnrolled();
        Course.getTotalCoursesOffered();
    }
}
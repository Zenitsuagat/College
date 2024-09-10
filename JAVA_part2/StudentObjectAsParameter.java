class Student{
    String stuName;
    int stuId;

    public Student(String name, int id){
        stuName = name;
        stuId = id;
    }

    public String getStuDetails(){
        return "Student "+stuName+" with ID "+stuId;
    }
}

class Course{
    String title;

    public Course(String title){
        this.title = title;
    }

    public void enrollStudent(Student student){
        System.out.println(student.getStuDetails()+" has been enrolled in the course: "+title);
    }
}

public class StudentObjectAsParameter{
    public static void main(String[] args){
        Student student1 = new Student("John",101);
        Course course1 = new Course("Maths");
        System.out.println("Case 1:");
        course1.enrollStudent(student1);
        
        Student student2 = new Student("Alice", 102);
        Course physicsCourse = new Course("Physics");
        System.out.println("Case 2:");
        physicsCourse.enrollStudent(student2);

        Student student3 = new Student("Bob", 103);
        Course csCourse = new Course("Computer Science");
        System.out.println("Case 3:");
        csCourse.enrollStudent(student3);
    }
}
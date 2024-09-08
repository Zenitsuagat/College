import java.util.Scanner;

class Person{
    String name;
    int age;
}

class Employee extends Person{
    String empId;
    String empDep;
}

class SingleInheritanceEmployee{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Employee obj = new Employee();
        String name =  "Alice";
        int age = 30;
        String Id = "C123";
        String Dep = "HR";
        obj.name = name;
        obj.age = age;
        obj.empId = Id;
        obj.empDep = Dep;

        System.out.println("Name : "+obj.name);
        System.out.println("Age : "+obj.age);
        System.out.println("Employee Id : "+obj.empId);
        System.out.println("Department : "+obj.empDep);
    }
}
import java.util.Scanner;

class Person{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Employee{
    String employeeId;
    double salary;

    public void setEmployeeId(String id){
        this.employeeId = id;
    }

    public void setSalaryy(double sal){
        this.salary = sal;
    }
}

class Manager{
    private Person person;
    private Employee employe;

    public Manager(){
        this.person = new Person();
        this.employe = new Employee();
    }

    public void setName(String name){
        person.setName(name);
    }

    public void setAge(int age){
        person.setAge(age);
    }

    public void setEmpID(String Id){
        employe.setEmployeeId(Id);
    }

    public void setSalary(double sala){
        employe.setSalaryy(sala);
    }

    public void printDetails(){
        System.out.println("Name : "+person.name);
        System.out.println("Age : "+person.age);
        System.out.println("Employee ID : "+employe.employeeId);
        System.out.println("Salary : "+employe.salary);
    }
}

public class MultipleInheritanceComposition{
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.setName("Bob");
        manager.setAge(45);
        manager.setEmpID("M456");
        manager.setSalary(95000.00);

        manager.printDetails();
    }
}
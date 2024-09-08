import java.util.Scanner;

class Employee{
    private String empName;
    private double empSalary;

    public void setName(String name){
        this.empName = name;
    }

    public void setSalary(double amount){
        if(amount > 0){
            this.empSalary = amount;
        }
        else{
            System.out.println("Invalid Salary");
        }
    }

    public String getName(){
        return this.empName;
    }

    public double getSalary(){
        return this.empSalary;
    }

}

class EmployeeSalary{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter the name of the employee : ");
        String name = input.nextLine();
        emp.setName(name);
        System.out.print("Enter the salary : ");
        double salary = input.nextInt();
        emp.setSalary(salary);

        System.out.println("Employee Name : "+emp.getName());
        System.out.println("EMployee Salary : "+emp.getSalary());

    }
}
import java.util.Scanner;

class Employee{
    String empName;
    int empId;
    Department department;

    class Department{
        String depName;
        String depLocation;

        public Department(String depName, String depLocation){
            this.depName = depName;
            this.depLocation = depLocation;
        }
    }

    public Employee(String name, int id, String dName, String dLoc){
        this.empName = name;
        this.empId = id;
        
        this.department = new Department(dName, dLoc);
    }

    public String getEmployeeDetails(){
        return "Employee Name: "+this.empName+", ID: "+this.empId+", Department: "+department.depName+", Location: "+department.depLocation;
    }

}

class EmployeeInnerClassDepartment{
    public static void main(String args[]){
        Employee employee1 = new Employee("Alice", 101, "HR", "New York");
        System.out.println("Case 1:\n"+employee1.getEmployeeDetails());

        Employee employee2 = new Employee("Bob", 102, "IT", "San Francisco");
        System.out.println("Case 2:\n"+employee2.getEmployeeDetails());

        Employee employee3 = new Employee("Charlie", 103, "Finance", "Chicago");
        System.out.println("Case 3:\n"+employee3.getEmployeeDetails());
    }
}
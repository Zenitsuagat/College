import java.util.Scanner;

class Employee{
    String ename;
    int eid;
    double basicSal;
    double allow;

    Employee(){
        this.ename = "";
        this.eid = 0;
        this.basicSal = 0;
        this.allow = 0;
    }

    Employee(String ename, int eid, double basicSal, double allow){
        this.ename = ename;
        this.eid = eid;
        this.basicSal = basicSal;
        this.allow = allow;
    }

    double grossCal(){
        return (this.basicSal + this.allow);
    }

    void display(){
        System.out.println("Name : "+this.ename);
        System.out.println("Id : "+this.eid);
        System.out.println("Basic Salary : "+this.basicSal);
        System.out.println("Allowance : "+this.allow);
        System.out.println("Gross Salary : "+grossCal());
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees : ");
        int noOfEmp = input.nextInt();

        input.nextLine();

        if(noOfEmp > 0){

            Employee[] employees = new Employee[noOfEmp];

            for(int i=0;i<noOfEmp;i++){
                System.out.println("\nENter the info of Employee "+(i+1)+": ");

                System.out.print("Name : ");
                String name = input.nextLine();

                System.out.print("Id : ");
                int id = input.nextInt();

                System.out.print("Basic Salary : ");
                double bs = input.nextDouble();

                System.out.print("Allowance : ");
                double all = input.nextDouble();

                input.nextLine();

                employees[i] = new Employee(name,id,bs,all);
            }

            for (int i = 0; i < employees.length; i++) {
                System.out.println("\nInfo of employee " + (i + 1) + ":");
                employees[i].display();
            }
        }
        else{
            return;
        }
    }
}
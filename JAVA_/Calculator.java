import java.util.Scanner;

class Calculator{

    double add(double a,double b){
        return a+b;
    }

    double sub(double a,double b){
        return a-b;
    }

    double mul(double a,double b){
        return a*b;
    }

    double div(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Zero division Erro");
        }
        return a/b;
    }

    void run(){
        Scanner input = new Scanner(System.in);
        boolean con = true;

        while(con){
            System.out.print("Enter the first number : ");
            double num1 = input.nextDouble();

            System.out.print("ENter the second number : ");
            double num2 = input.nextDouble();

            input.nextLine();

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice : ");
            int cho = input.nextInt();

            input.nextLine();

            double result = 0;

            try{
                switch(cho){
                case 1:
                    result = add(num1,num2);
                    break;

                case 2:
                    result = sub(num1,num2);
                    break;

                case 3:
                    result = mul(num1,num2);
                    break;

                case 4:
                    result = div(num1,num2);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
                }

                System.out.println("Result : "+result);
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userinput = input.nextLine();

            con = userinput.equalsIgnoreCase("yes");

        }

        System.out.println("Exiting.");
    }

    public static void main(String[] args){
        Calculator cal = new Calculator();
        cal.run();
    }
}
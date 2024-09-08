import java.util.Scanner;

class Bank{
    private double balance;

    public void getBalance(){
        System.out.println("Balance : $"+this.balance);
    }

    public void initiate(double amount){
        if(amount > 0){
            this.balance = amount;
            getBalance();
        }
        else{
            System.out.println("Invalid amount");
            getBalance();
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposited");
            getBalance();
        }
        else{
            System.out.println("Invalid amount");
            getBalance();
        }
    }

    public void withdraw(double amount){
        if(amount > 0){
            if(this.balance >= amount){
                this.balance -= amount;
                System.out.println("Withdrew");
                getBalance();
            }
            else{
                System.out.println("Insufficient balance");
                getBalance();
            }
        }
        else{
            System.out.println("Invalid amount");
            getBalance();
        }
    }
}

class BankAccountManagement{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank();

        while (true){
            System.out.println("1.Initiate Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter your choice : ");
            int ch = input.nextInt();
            input.nextLine();

            if(ch == 1){
                System.out.print("Amount : ");
                double amount = input.nextDouble();
                bank.initiate(amount);
            }
            else if(ch == 2){
                System.out.print("Amount : ");
                double amount = input.nextDouble();
                bank.deposit(amount);
            }
            else if(ch == 3){
                System.out.print("Amount : ");
                double amount = input.nextDouble();
                bank.withdraw(amount);
            }
            else if(ch == 4){
                break;
            }

        }
    }
}
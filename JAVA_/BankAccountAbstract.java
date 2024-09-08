import java.util.Scanner;

abstract class BankAccount{
    double balance;

    public BankAccount(double amount){
        this.balance = amount;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void displayBalance();
}

class SavingsAccount extends BankAccount{
    SavingsAccount(double amount){
        super(amount);
    }

    public void deposit(double amt){
        if (amt > 0){
            this.balance += amt;
            System.out.println("Deposited");
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amt){
        if(amt > 0 && this.balance >= amt){
            this.balance -= amt;
            System.out.println("Withdrew");
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void displayBalance(){
        System.out.println("Balance : "+this.balance);
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(double amount){
        super(amount);
    }

    public void deposit(double amt){
        if (amt > 0){
            this.balance += amt;
            System.out.println("Deposited");
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amt){
        if(amt > 0 && this.balance >= amt){
            this.balance -= amt;
            System.out.println("Withdrew");
        }
        else{
            System.out.println("Invalid amount");
        }
    }

    public void displayBalance(){
        System.out.println("Balance : "+this.balance);
    }
}

class BankAccountAbstract{
    public static void main(String args[]){
        
        SavingsAccount savings = new SavingsAccount(2000);
        savings.deposit(500);
        savings.withdraw(1000);
        savings.displayBalance();

        CurrentAccount current = new CurrentAccount(1000);
        current.deposit(300);
        current.withdraw(1500); 
        current.displayBalance();

    }
}
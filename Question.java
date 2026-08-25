import java.util.Scanner;
class Account{
    double balance;
    void deposit( double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Amount deposit successfully");
        }
        else{
            System.out.println("Invalid deposit amount");
        }

    }
    void withdraw( double amount){
        if(amount < 0){
            System.out.println("Invalid withdrwal amount.");
        }
        else if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Amount withdrwalsuccessfully.");
        }
    }
    void displayBalance(){
        System.out.println("Current balance: Rs." + balance);
    }
}
public class Question{
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter deposit amount:");
        double depositAmount = input.nextDouble();

        account.deposit(depositAmount);
        account.displayBalance();

        System.out.println("Enter withdrwal amount:");
        double withdrwalAmount = input.nextDouble();

        account.withdraw(withdrwalAmount);
        account.displayBalance();
    }
}



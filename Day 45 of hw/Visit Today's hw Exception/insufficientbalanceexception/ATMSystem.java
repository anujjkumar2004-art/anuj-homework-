
package insufficientbalanceexception;
import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message) 
    {
        super(message);
    }
}

class ATM 
{
    private double balance = 10000;

    public void withdraw(double amount) throws InsufficientBalanceException 
    {
        if (amount > balance) 
        {
            throw new InsufficientBalanceException("Insufficient Balance! Transaction Failed.");
        } else 
        {
            balance -= amount;
            System.out.println("Please collect your cash: " + amount);
        }
    }

    public void checkBalance() 
    {
        System.out.println("Available Balance: " + balance);
    }
}

public class ATMSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        int choice;

        do {
            System.out.println("\n****ATM MENU****");
            System.out.println("1. Withdraw");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try 
            {
                switch (choice) 
                {
                    case 1:
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        atm.withdraw(amount);
                        break;

                    case 2:
                        atm.checkBalance();
                        break;

                    case 3:
                        System.out.println("Thank you visit again and again");
                        break;

                    default:
                        System.out.println("Invalid choice! Neega Thappa choose panraga so correct ahh pannuga.");
                }
            }
            catch (InsufficientBalanceException ex) 
            {
                System.out.println(ex.getMessage());
            }

        } while (choice != 3);
    }
}

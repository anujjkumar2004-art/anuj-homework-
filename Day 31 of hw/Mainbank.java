import java.util.Scanner;

class Mainbank
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Object of second program (Bankaccount)
        Bankaccount acc = new Bankaccount();  

        int choice;
        double amount;

        do
        {
            System.out.println("\n***** MENU *****");	
            System.out.println("1. Deposit");	
            System.out.println("2. Withdraw");	
            System.out.println("3. Display balance");	
            System.out.println("4. Exit");	
            System.out.print("Enter your option: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    amount = sc.nextDouble();
                    acc.deposit(amount);   // calling second program method
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    amount = sc.nextDouble();
                    acc.withdraw(amount);  // calling second program method
                    break;

                case 3:
                    acc.displayamount();   // calling second program method
                    break;

                case 4:
                    System.out.println("Exit the program...!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while(choice != 4);
    }
}

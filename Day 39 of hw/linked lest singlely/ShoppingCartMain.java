package shoppingcart;
import java.util.Scanner;
public class ShoppingCartMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        int choice;
        do
        {
            System.out.println("\n*****SHOPPING MENU*****");
            System.out.println("1.Add product to cart");
            System.out.println("2. View Cart Items");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    cart.Product(id, name, price);
                    break;

                case 2:
                    cart.display();
                    break;

                case 3:
                    System.out.println("Exiting Shopping Cart...Thank you");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (choice!=3);
    }

    private static class ShoppingCart 
    {

        public ShoppingCart() 
        {
            
        }

        private void Product(int id, String name, double price) 
        {
           
        }

        private void display() 
        {
           
        }
    }

}

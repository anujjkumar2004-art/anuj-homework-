package shoppingcard;
import java.util.Scanner;
import shoppingcard.ShoppingCard.Item;

public class ShoppingMain 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        ShoppingCard cart = new ShoppingCard();

        System.out.print("Enter Cart Owner Name: ");
        cart.cartOwnerName = sc.nextLine();

        System.out.print("Enter Item Name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Number of Price Updates: ");
        int updates = sc.nextInt();

        Item item = cart.new Item(itemName, quantity, updates);

        item.addPrice(sc);

        item.display();
    }
} 


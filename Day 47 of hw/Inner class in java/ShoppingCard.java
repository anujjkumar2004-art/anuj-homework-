
package shoppingcard;

import java.util.Scanner;

public class ShoppingCard 
{
    String cartOwnerName;
    
    class Item
    {
        String itemName;
        int quantity;
        double[] priceHistory;

        public Item(String itemName, int quantity, int priceUpdates) 
        {
            this.itemName = itemName;
            this.quantity = quantity;
            priceHistory = new double[priceUpdates];
        }
        
        void addPrice(Scanner sc)
        {
            System.out.print("Enter your Price:");
            for (int i = 0; i < priceHistory.length; i++) 
            {
                priceHistory[i]=sc.nextDouble();
            }
        }
        
        double getLatestprice()
        {
            return priceHistory[priceHistory.length-1];
        }
        
        double calculateTotalBill()
        {
            return getLatestprice()*quantity;
        }
        
        void display()
        {
            System.out.println("\nCart Owner:" + cartOwnerName);
            System.out.println("Item Name:" + itemName);
            System.out.println("Quantity:" + quantity);
            System.out.println("Price History:");
            for (double price:priceHistory) 
            {
                System.out.println(price +" ");
            }
            System.out.println("\nLatest Price: " + getLatestprice());
            System.out.println("Total Bill: " + calculateTotalBill());
        }
    }
}



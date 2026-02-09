package shoppingcart;
public class Product 
{
    int id;
    String Name;
    double price;
    Product next;

    public Product(int id, String Name, double price) {
        this.id = id;
        this.Name = Name;
        this.price = price;
        this.next = null;
    }
}

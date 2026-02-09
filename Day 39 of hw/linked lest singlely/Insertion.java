package shoppingcart;
public class Insertion 
{
    Product head;

    public Insertion(Product head) 
    {
        this.head = head;
    }
    
    
    
    void insert(int id, String Name, double price)
    {    
      Product p = new Product(id,Name,price); 
      
      if(head==null)
      {
          head = p;
      }
      else
      {
          Product temp = head;
          while(temp.next!=null)
          {
              temp =temp.next;
          }
          temp.next=p;
      }
      System.out.println("Product added to cart succesfully");
    }
    
    void display()
    {
        if(head==null)
        {
            System.out.println("Cart is empty");
            return;
        }
        
        Product temp = head;
        System.out.println("\n*****SHOPPING CART ITEMS*****");
        while(temp!=null)
        {
            System.out.println("product ID:" + temp.id);
            System.out.println("product Name:" + temp.Name);
            System.out.println("price:" + temp.price);
            temp = temp.next;
        }
    }
}

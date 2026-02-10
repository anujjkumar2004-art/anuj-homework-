package singlylinked;
public class SinglyLinkedMainn 
{
    public static void main(String[] args) 
    {
        InsertAndDelete id = new InsertAndDelete();
        
        id.insert(25);
        id.insert(32);
        id.insert(45);
        id.insert(6);
        id.insert(24);
        id.insert(52);
        id.display();
        System.out.println("");
        id.Delete(6);
        System.out.println("After delete value");
        id.display();
        
    }
}

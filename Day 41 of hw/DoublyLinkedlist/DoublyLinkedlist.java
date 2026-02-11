package doublylinkedlist;
public class DoublyLinkedlist 
{
    public static void main(String[] args) 
    {
       Insertion in = new Insertion();
       in.insertAtEnd(10);
       in.insertAtEnd(20);
       in.insertAtEnd(40);
       in.insertAtEnd(50);
       
       in.insertAtPosition(30,20);
       in.display();
    }
    
}

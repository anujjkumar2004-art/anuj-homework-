
package singlylinked;
public class InsertAndDelete
{
    Node head = null;
    
    public void insert(int data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void Delete(int value)
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value)
        {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.data != value)
        {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
        {
            System.out.println("Value not found");
        }
        else
        {
            prev.next = temp.next;
        }
    }

    public void display()
    {
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
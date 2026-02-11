package doublylinkedlist;
class Insertion  
{
    Node head;
    Node tail;
   
    void insertAtEnd(int data) 
    {
        Node n = new Node(data);

        if (head == null) 
        {
            head = n;
            tail=n;
        }
        else
        {
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }

    public void insertAtPosition(int data, int position) 
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do
        {
            if(temp.data==position)
            {
                Node n =new Node(data);
                
                n.next=temp.next;
                temp.next=n;
                
                if(temp==tail)
                {
                    tail=n;
                }
                return;
            }
            temp=temp.next;
        }while(temp!=head);
                System.out.println("");
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("List is emoty");
            return;
        }
        Node temp = head;
        
        do
        {
            System.out.print(temp.data + "<-->");
            temp=temp.next;  
        }while(temp!=null);
        System.out.println("NULL");
    }
}    

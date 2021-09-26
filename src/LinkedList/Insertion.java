package LinkedList;

public class Insertion {
    static Node insert(int d, Node head)
    {
        Node new_node = new Node();
        new_node.data = d;
        new_node.next = null;
        if(head == null)
        {
            head = new_node;
            return head;
        }
        Node temp = head;
        while (temp.next!= null)
        {
            temp = temp.next;
        }
        temp.next = new_node;
        return head;
    }

    static Node insertion_start(int d , Node head)
    {
        Node new_node = new Node();
        new_node.data =d;
        new_node.next = null;
        if(head == null)
        {
            head= new_node;
        }
        else
        {
            new_node.next = head;
            head = new_node;
        }
        return head;
    }

    static Node insertion_middle(int search, int d, Node head)
    {
        Node new_node = new Node();
        new_node.data = d;
        new_node.next = null;
        Node temp = head;
        int f=0;
        if(head == null)                        //empty linked list
        {
            head = insert(d, null);
            return head;
        }
        while (temp != null)
        {
            if(temp.data == search)
            {   f=2;
                new_node.next = temp.next;
                temp.next = new_node;
                return head;
            }
            temp = temp.next;
        }
        if(f == 0)//search element is not found
        {
            return null;
        }
     return head;
    }
}

package LinkedList;

public class Deletion {
    static Node delete(int del, Node head)
    {
        Node temp = head;
        if(temp.data == del)             //first element to be deleted
        {
            head= temp.next;
            return head;
        }
        while (temp.next != null)
        {
            if(temp.next.data == del)
            {
                temp.next = temp.next.next;
                break;
            }
            temp =temp.next;
        }
        return head;
    }
}

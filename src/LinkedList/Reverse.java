package LinkedList;

public class Reverse {
    static void reverse(Node head)
    {
        if(head == null)
        {
            return;
        }
        else
        {
            reverse(head.next);
            System.out.print(head.data+ " ");
        }
    }
}

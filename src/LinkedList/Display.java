package LinkedList;

public class Display {
    static void display(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data+ " ");
            head = head.next;
        }
    }
}

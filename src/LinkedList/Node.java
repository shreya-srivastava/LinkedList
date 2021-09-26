package LinkedList;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Node {
    int data;
    Node next;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 values");
        Node head = null;
        for (int i = 0; i < 5; i++) {
            int d = input.nextInt();
            head = Insertion.insert(d, head);
        }
        System.out.println("Linked list is");
        Display.display(head);
        System.out.println();

        System.out.println("Reversed linked list");
        Reverse.reverse(head);
        System.out.println();


        //adding new element at starting
        head = Insertion.insertion_start(45, head);
        System.out.println("New linked list");
        Display.display(head);
        System.out.println();

        //adding element in middle
        System.out.println("After which element you want to enter");
        int search = input.nextInt();
        System.out.println("Enter element you want to add");
        int value = input.nextInt();
        head = Insertion.insertion_middle(search, value, head);
        if (head == null)
        {
            System.out.println("Search element not found");
        }
        else
        {
            System.out.println("New linked list");
            Display.display(head);
        }
        System.out.println();

        //deleting element
        System.out.println("Element you want to delete");
        int del = input.nextInt();
        head = Deletion.delete(del,head);
        Display.display(head);




        //deletion

    }
}

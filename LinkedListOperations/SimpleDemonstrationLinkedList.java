package LinkedList;

import java.util.LinkedList;

public class SimpleDemonstrationLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        // add the element at the beginning of the linked-list:
        linkedlist.addFirst(0);
        // add the element at the end of the linked-list:
        linkedlist.addLast(4);
      // print the elements of linked-list:
        for(Integer i :linkedlist){
            System.out.print(i + " ");
        }
    }
}

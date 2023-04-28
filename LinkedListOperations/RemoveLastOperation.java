package LinkedList;

import java.util.LinkedList;

public class RemoveLastOperation {


 public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Linked list:" + list);
        // Remove the tail using removeList();
        System.out.println("The last element is removed:" + list.removeLast());
        // final linked list
        System.out.println("Final linked list " + list);
    }

}

package LinkedList;

import java.util.LinkedList;

/*
Adding elements
Updating elments
Removing elemts
Iterating over elments
To Array(0;
Size();
remove First();
remove last();

 */
public class DifferentOperationsOnLinkedList {
//    Operation 1: Adding Elements
//    In order to add an element to an ArrayList, we can use the add() method. This method is overloaded to perform multiple operations based on different parameters. They are:
//
//    add(Object): This method is used to add an element at the end of the LinkedList.
//    add(int index, Object): This method is used to add an element at a specific index in the LinkedList.

    public static void main(String[] args)
    {
        LinkedList<String> ll =new LinkedList<>();
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1,"For");

        System.out.println(ll);
    }



}

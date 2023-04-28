package LinkedList;

import java.util.LinkedList;

public class RemovingElements {
    public static void main(String[] args){
//        In order to remove an element from a LinkedList, we can use the remove() method. This method is overloaded to perform multiple operations based on different parameters. They are:

//        remove(Object): This method is used to simply remove an object from the LinkedList. If there are multiple such objects, then the first occurrence of the object is removed.
//        remove(int index): Since a LinkedList is indexed, this method takes an integer value which simply removes the element present at that specific index in the LinkedList. After removing the element and the indices of elements are updated so do the object of LinkedList is updated giving a new List after the deletion of element/s.

        LinkedList<String> ll = new LinkedList<>();
        ll.add("geeks");
        ll.add("geeks");
        ll.add(1,"for");
        System.out.println("Initial linked list "+ ll);

        ll.remove(1);
        System.out.println("After the index removal "+ ll);
        ll.remove("geeks");
        System.out.println("After the object removal " + ll);

    }
}

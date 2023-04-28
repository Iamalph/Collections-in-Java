package LinkedList;

import java.util.LinkedList;

public class ChangingElements {
    public static void main(String[] args){
//        Operation 2: Changing Elements
//        After adding the elements, if we wish to change the element, it can be done using the set() method. Since a LinkedList is indexed, the element which we wish to change is referenced by the index of the element. Therefore, this method takes an index and the updated element which needs to be inserted at that index.

        LinkedList<String> ll = new LinkedList<>();
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1,"Geeks");
        System.out.println("Initial LinkedList : " + ll);
        ll.set(1,"For");
        System.out.println("updated LinkedList : "+ ll);

    }
}

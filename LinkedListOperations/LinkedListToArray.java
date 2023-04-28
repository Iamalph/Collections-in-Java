package LinkedList;

import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);
        System.out.println("Linked list: " + list);
        Object[] a = list.toArray();
        System.out.println("after converting linkedlist to array :");
        for(Object element : a){
            System.out.print( element + " ");
        }
    }
}

package LinkedList;
import java.util.*;

public class SinglyLinkedCollections1 {
    public static void main (String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(6);
        ll.add(7);
//        System.out.println(ll.toString().getClass().getSimpleName());
        String str = ll.toString();

//        System.out.println(ll.getClass().getSimpleName());
        for(Integer i: ll){
            System.out.print(i+ " ");
            System.out.println(i.getClass().getSimpleName());
//          break;
        }

//        for(String str: ll)
// {
// this will throw an error as 5,6, and 7 are of integer data type.
//  }
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);
        System.out.println(sb.reverse().substring(1,8));
        for(Integer i : ll){
            System.out.print(i);
            System.out.println(i.getClass().getSimpleName());
        }


    }
}

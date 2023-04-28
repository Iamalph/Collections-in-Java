package LinkedList;
import java.util.*;
public class RemoveFirstOperation {
    public static void main(String[] args){
         LinkedList<Integer> list =new LinkedList<>();
         list.add(10);
         list.add(20);
         list.add(30);
        System.out.println("LinkedList: "+ list );
        System.out.println("The remove first element is :" + list.removeFirst());
        // the final list after removing the
        System.out.print("The final list is :" + list);
    }
}

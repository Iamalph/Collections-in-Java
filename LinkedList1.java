package Collections;
import java.util.List;
import java.util.LinkedList;
public class LinkedList1 {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>();
// adding elements in the linkedlist:
        list.add(3);
        list.add(10);
        list.add(20);

        // removing the elements :
        list.remove(0); // it's very fast this is why we like linkedList.
        System.out.println(list.get(1)); // not that fast as compared to arrayList;
        for(Integer i :list){
            System.out.println(i);
        }

        // finding size of list:
        System.out.println("the size of list is: " + list.size());

        // isEmpty()
        System.out.println("Is array empty: " + list.isEmpty());

    }
}

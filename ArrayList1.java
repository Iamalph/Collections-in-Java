package Collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args){
// () in here we provide the size of the array;
        List<String> list = new ArrayList<>();
        // adding elments in list;
        list.add("somesh");
        list.add("Ramu");
        list.add("shamu");

        // removing the item:
        list.remove(0);// removing is not that efficient.

        // what is this random access :
        System.out.println(list.get(0));// random access / very fast: O(1)

        // checking if the list is empty or not using : isEmpty();
        System.out.println(list.isEmpty());

        // printing the size of the list:
        System.out.println(list.size());

        // toArray(): convertes array list to one dimentional array.
        Object [] array = list.toArray();
        System.out.println("using toArray()");
        for(Object s : list){
            System.out.println(s);
        }
        System.out.println("end of toArray()");
        // we want to go through the list we can use iterator or for-each loop
        for(String s: list){
            System.out.println(s);
        }


// don't think of abve code imagine you have array with the follwing elements in it : and you delete ramu kaka which is at o index
        // now somesh will shift to ramu kaka position , then kaka will shift to somesh position and so on .
        // as there are several shifts there fore its not efficient.
        /// this problem can be solved using linked list
        // lets say we have severl add as follows:
        list.add("ramu kaka");
        list.add("somesh");
        list.add("kaka");
        list.add("ram");
        list.add("baby");
        list.add("kuti");
        list.add("zebra");



    }
}

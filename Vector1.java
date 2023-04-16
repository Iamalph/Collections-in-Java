package Collections;

import java.util.Vector;
import java.util.List;
public class Vector1 {
    public static void main(String[] args){
        // here we made instance of vector class and it has two paramters capacity and capacityIncrement
        List<Integer> vector = new Vector<>(10,5);

        // adding element in the vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        // removing element from the vector
        vector.remove(0);
        //printing the elements from the list, as it is list we do use for each loop:

        for(Integer i :vector){
            System.out.println(i);
        }



    }
}

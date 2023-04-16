package Collections;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args)
    {
        Deque<Integer> deque = new ArrayDeque<>();
    //inserting the element from the beginning and end of the queue.
        deque.offerFirst(10);// with the help of the offerFirst method we are able to insert element at the beginning of the queue.
        deque.offerLast(20); // with the help of the offerLast method we are able to insert element at the end of the queue.
        deque.offerFirst(30);
        deque.offerLast(40);

        // removing the element from the queue from the first .
        deque.removeFirst();// 30 will be removed

        // removing the element from the queue from the last.
        deque.removeLast();


        for(Integer i: deque){
            System.out.println(i);
        }
    }
}

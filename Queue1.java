package Collections;

import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {
    public static void main(String[] args){
        Queue<String> queue =new LinkedList<>();

        // adding string into the queue;
        queue.add("Deshmukh");
        queue.add("ramu");
        queue.add("manu");

        // element () method : we get the first item without removing it !!!
queue.element();

// size():
        System.out.println(queue.size());
// remove() method :
        queue.remove();
for(String s :queue){
    System.out.println(s);
}
    }
}

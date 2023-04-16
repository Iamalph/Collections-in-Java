package Collections;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueue1 {
    public static void main(String[] args){

        Queue<Person> queue = new PriorityQueue<>();

        queue.add(new Person("deshmkh", 22));
        queue.add(new Person("akash", 31));
        queue.add(new Person("Kevin", 23));

        System.out.println(queue.peek());


        while(queue.peek() != null){
            System.out.println(queue.poll());
        }

    }
}

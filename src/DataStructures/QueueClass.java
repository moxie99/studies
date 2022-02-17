package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

    public static void main(String[] args) {
        Queue<String>queue = new LinkedList<String>();
        queue.add("Honda");
        queue.add("Toyota");
        queue.add("Mercedes");
        queue.add("Lexus");
        System.out.println(queue);

        queue.forEach(System.out::println);

        queue.remove("Mercedes");
        System.out.println(queue);
        System.out.println("Queue size " + queue.size());
        System.out.println("Queue contains element 'two' or not? : " + queue.contains("two"));

        queue.clear();




    }
}

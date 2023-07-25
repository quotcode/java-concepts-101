package List;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListImplementation {
    public static void main(String[] args) {
        /* Whenever we want to implement a classic FIFO QUEUE: We go for LinkedList which is
        *  actually a Doubly LinkedList implementation more precisely of the Queue Interface
        */
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.offer(900); myQueue.offer(100);myQueue.offer(200); myQueue.offer(29);
        myQueue.offer(700); myQueue.offer(-1);myQueue.offer(300); myQueue.offer(99);

        System.out.println(myQueue); //[900, 100, 200, 29, 700, -1, 300, 99]
        System.out.println(myQueue.peek()); // this will not remove the element from actual Queue but just helps us browse the first element
        System.out.println(myQueue.poll()); // this will remove the first element from actual Queue
        myQueue.poll();

        System.out.println(myQueue.isEmpty()); // returns true if the Queue is empty


    }
}

package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeImplementation {
    //ArrayDeque implements the Deque interface: which is doubly ended queue
    // so this means we can use ArrayDeque as a Stack also and a Queue also both at same time.

    public static void main(String[] args) {
        Deque<Integer> dq1 = new ArrayDeque<Integer>();

        // ----- implementing ArrayDeque as a Stack
        System.out.println("Pushing elements to stack: ");
        dq1.offerLast(245);System.out.println(dq1);
        dq1.offerLast(29);System.out.println(dq1);
        dq1.offerLast(10);System.out.println(dq1);
        dq1.offerLast(3);System.out.println(dq1);

        System.out.println("Popping elements from stack: " + dq1);

        while(!dq1.isEmpty()){
            System.out.println("Popped: " + dq1.pollLast());
        }
        // ----- implementing ArrayDeque as a Queue
        System.out.println("Adding elements to queue: ");
        dq1.offerLast(245);System.out.println(dq1);
        dq1.offerLast(29);System.out.println(dq1);
        dq1.offerLast(10);System.out.println(dq1);
        dq1.offerLast(3);System.out.println(dq1);
        System.out.println("Removing elements from Queue: ");
        while(!dq1.isEmpty()){
            System.out.println(dq1.poll());
        }




    }
}

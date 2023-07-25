package Queue;

import java.util.PriorityQueue;

public class PriorityQueueImplementation {
    public static void main(String[] args) {

        /* A priority queue is a special kind of Queue which takes elements which implements either Comparator interface or at least Comparable interface
        --- To store the elements it uses "Natural Ordering" when it implements Comparable interface
            For example: for Integer class we have ascending order as the Natural Order in the compareTo() of Comparable interface
        --- if we need to change the order to something else then we can't basically change the existing legacy Java Code
            for this we have to write a different class that implements Comparator Interface whose compare() we can override.
            So it always has more precedence over the compareTo() of Comparable interface.
            // it follows "Total Ordering" when it uses Comparator interface
            this way of storing the elements using Comparator is called "Total Ordering"

        Note:
        If working with Custom Objects like Employee, Student etc. Try to implement Comparable Interface
        in your Classes else the Priority Queue will give the ClassCastException,
        since it doesn't know how to order the elements which are not regular Java Objects.
        */

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(123);
        pq.offer(989);
        pq.offer(100);
        pq.offer(256);
        pq.offer(10);
        pq.offer(700);
        pq.offer(190);
        pq.offer(198);

        System.out.println("We see that we have ascending order of elements stored");
        while (!pq.isEmpty()) {

            System.out.println(pq.poll());
        }
        System.out.println("To make it descending order we will have to go for Comparator " +
                "as we can't change the existing Comparable -> compareTo() ");

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(new CustomIntegerComparator());

        pq1.offer(123);
        pq1.offer(989);
        pq1.offer(100);
        pq1.offer(256);
        pq1.offer(10);
        pq1.offer(700);
        pq1.offer(190);
        pq1.offer(198);
        System.out.println("We see that we have descending order of elements stored, following the Total Ordering of the Queue.CustomIntegerComparator");
        while (!pq1.isEmpty()) {

            System.out.println(pq1.poll());
        }

        System.out.println("For changing the order we can also use an anonymous class " +
                "or we can also use Lambda expressions if we only have a single line of modification" );

        // using the lambda expression and passing the function compare() anonymously which is what a Lambda Function does
        PriorityQueue<Integer> pq2 = new PriorityQueue<>( (obj1, obj2) -> (obj2 - obj1));
        pq2.offer(123);
        pq2.offer(989);
        pq2.offer(100);
        pq2.offer(256);
        pq2.offer(10);
        pq2.offer(700);
        pq2.offer(190);
        pq2.offer(198);

        while (!pq2.isEmpty()) {

            System.out.println(pq2.poll());
        }


    }
}

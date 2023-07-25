import java.util.ArrayList;
import java.util.List;

public class ArrayListImplementation {
    public static void main(String[] args) {
        // Whenever we want a List we can go for ArrayList implementation of List interface.
        // as it is faster than LinkedList and Vector when it comes to random access O(1)
        // but it is slower in Frequent Insertion and deletion O(n)
        // also it is not Thread Safe like Vector
        List<Integer> myList = new ArrayList<>();

        myList.add(21);
        myList.add(2);
        myList.add(63);
        myList.add(19);
        myList.add(100);

        System.out.println(myList); //[21, 2, 63, 19, 100]

        List<Integer> l2 = new ArrayList<>(myList);
        l2.add(2);
        l2.add(90);
        l2.add(19);
        l2.add(29);
        l2.add(39);

        // sublist => from (index1): 2 to (index2)-1:4
        // Note: sublist() always does Deep Copy: means it copies the data from Original Array to new array
        // but it refers the same address of older elements
        // this means whatever we do with new one, older one will get changed accordingly.
        List<Integer> l3 = l2.subList(2, 5);
        System.out.println(l2); // [21, 2, 63, 19, 100, 2, 90, 19, 29, 39]
        System.out.println(l3); //[63, 19, 100]
        l3.add(777);
        System.out.println(l2);
        System.out.println(l3);


    }

}

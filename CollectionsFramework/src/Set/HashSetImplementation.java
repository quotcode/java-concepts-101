package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementation {

    /*
    * HashSet: It is Set implementation where insertion order is not maintained i.e. when we traverse we will always get random order of the elements.
    * Advantage of using a HashSet is the insertion and deletion is quicker also there wont be duplicate elements.
    * Disadvantage  is that we cannot Sort the elements present.
    * */
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>(set1);

        set1.remove(1);

        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);

        set2.removeAll(set1); // Set Difference i.e. common elements will be removed
        set2.retainAll(set1); // Set Intersection i.e. common elements will be retained
        set2.addAll(set1); // Set Union i.e. Elements of both set will be added inside the set2.



    }
}

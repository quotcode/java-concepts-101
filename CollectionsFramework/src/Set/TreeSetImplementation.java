package Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetImplementation {

    //Treeset: this is a type of Set which implements extends NavigableSet interface which extends Sorted Set interface
    // Treeset provides a sorted elements on traversal based on the Comparable or Comparator interface implemented for the element object type
    public static void main(String[] args) {
        NavigableSet<StudentMarks> set1 = new TreeSet<>();
        set1.add(new StudentMarks(30,41,100));
        set1.add(new StudentMarks(60,55,44));
        set1.add(new StudentMarks(90,34,55));
        set1.add(new StudentMarks(71,89,30));
        set1.add(new StudentMarks(72,80,30));
        set1.add(new StudentMarks(71,81,31));
        set1.add(new StudentMarks(73,80,32));
        set1.add(new StudentMarks(79,88,38));



        for(StudentMarks s: set1 ){
            // here we have a compareTo() method of Comparable interface in StudentMarks class which orders in ascending order of maths marks
            System.out.println(s);
        }

        NavigableSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(10);treeSet2.add(9);treeSet2.add(-1);treeSet2.add(20);

        System.out.println(treeSet2.floor(10)); // floor(num) : lowest closest or equal to num
        System.out.println(treeSet2.ceiling(2)); // ceiling(num): highest closest or equal to num
        System.out.println(treeSet2.higher(10)); // higher(num): strictly higher
        System.out.println(treeSet2.lower(20)); // lower(num): strictly lower
    }
}

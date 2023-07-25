package Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

public class LinkedHashSetImplementation {
    /* LinkedHashSet: it extends the HashSet class.
    *  LinkedHashSet maintains the order of insertion of items
    * as it implements LinkedList variant of set so whatever will be added or removed will have the order maintained
    * Like HashSet, LinkedHashSet also does not order by Sorting.
    * Advantage of using a LinkedHashSet is the insertion and deletion is quicker also there won't be duplicate elements.
    * */
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(20);
        set1.add(10);
        set1.add(90);
        set1.add(100);
        set1.add(30);

        for(int item: set1){
            System.out.println(item);
        }


        // to implement LinkedHashSet or HashSet for custom objects its mandatory to have a custom equals() and hashcode() methods to be generated,
        // in order to have a common hash generated for Objects of same class which otherwise was not possible earlier as it by default takes the memory location hash as the hashcode.
        // and then compares it
        List<StudentMarks> studMarksList = new ArrayList<>();
        studMarksList.add(new StudentMarks(10,30,60));
        studMarksList.add(new StudentMarks(20,20,60));
        studMarksList.add(new StudentMarks(30,10,50));
        studMarksList.add(new StudentMarks(40,40,50));
        studMarksList.add(new StudentMarks(50,50,60));

        Set<StudentMarks> studMarksSet = new LinkedHashSet<>(studMarksList);

        // if we dont have custom hashcode and equals method of the custom Class then by default it takes the Object class' hash which is the memory ref hashcode.
        System.out.println(studMarksSet.contains(new StudentMarks(10,30,60)));
    }

}

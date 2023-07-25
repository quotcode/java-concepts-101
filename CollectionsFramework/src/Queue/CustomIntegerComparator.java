package Queue;

import java.util.Comparator;

public class CustomIntegerComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // this basically tells the Comparator to order in Descending Order
        return o2 - o1;
    }
}

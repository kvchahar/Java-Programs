package genericspractice.comparator;

import java.util.Comparator;

public class ComImpl implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1%10 > o2%10) // sorted according to last digit
            return 1;
        return -1;
    }
}

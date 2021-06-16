package lesson13;

import java.util.Comparator;

public class StringReverseComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return - s.compareTo(t1);
    }
}

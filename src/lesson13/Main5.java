package lesson13;

import java.util.TreeSet;

public class Main5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new StringReverseComparator());
        treeSet.add("q2qqq");
        treeSet.add("aaaa");
        treeSet.add("rrrr");
        treeSet.add("q2qqqqqqq");

        System.out.println(treeSet);

    }
}

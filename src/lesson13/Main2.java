package lesson13;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("qqq");
        set.add("aaa");
        set.add("zzz");
        set.add("xxx");
        set.add("zzz");
        set.add("zzz");

        System.out.println(set);
    }
}

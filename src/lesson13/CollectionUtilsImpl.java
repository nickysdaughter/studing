package lesson13;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List listC = new ArrayList();
        listC.addAll(a);
        listC.addAll(b);
        return listC;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        List listC = new ArrayList();
        for (Integer i : a) {
            if (b.contains(i)) {
                listC.add(i);
            }
        }
        for (Integer i : b) {
            if (a.contains(i)) {
                listC.add(i);
            }
        }
        return listC;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : a) {
            set.add(i);
        }
        for (Integer i : b) {
            if (!a.contains(i)) {
                set.add(i);
            }
        }
        return set;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                set.add(i);
            }
        }
        return set;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> difference = new LinkedList<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                difference.add(num);
            }
        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                difference.add(num);
            }
        }
        return difference;
    }
}

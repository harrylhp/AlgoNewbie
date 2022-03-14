package zProblem.StringPlayAround;

import java.util.*;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        HashSet<String> hset = new HashSet<>();
        Collections.addAll(hset, names1);
        Collections.addAll(hset, names2);

        TreeSet<String> trSet = new TreeSet<>(hset);
        System.out.println("TreeSet :" +trSet);

        //Use Array to Print Out
        String[] names3 = new String[hset.size()];
        hset.toArray(names3);
        Arrays.sort(names3);
        System.out.println(names3);

        return trSet.toArray(new String[trSet.size()]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}

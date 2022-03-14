package zProblem;

import java.util.*;

public class FindNumberUnSortedArray {
    public static void main(String []args){
        List<Integer> array = new ArrayList<>(Arrays.asList(3,6,2,10,8));
        List<Integer> array2 = new ArrayList<>();
        System.out.println("Number 10 is found or not: " + findNumber(array,10));
        System.out.println("Number 5 is found or not: " + findNumber(array,5));
        System.out.println("Number 8 is found or not: " + findNumber(array2,8));
    }

    public static String findNumber(List<Integer> array, int k){
        if (array == null)
            return "NO";

        Set<Integer> set = new HashSet<>(array);
        if (set.contains(k))
            return "YES";
        return "NO";
    }
}

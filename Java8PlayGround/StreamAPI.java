package Java8PlayGround;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String []args){
        ArrayList<String> aList = new ArrayList<>(Arrays.asList("Hello", "World", "2002"));
        System.out.println("List 4 is : " + aList.get(2));

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 3, 4,5));
        for (String s : aList) {
            System.out.println("Element in ArrayList " + s);
        }
        long count = aList.stream().filter(s -> s.length() < 4).count();
        System.out.println("The count is " + count);

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18);
        Integer lcm = listOfNumbers.stream()
                        .filter(i -> i % 2 == 0)
                        .filter(i -> i % 3 == 0) .findFirst().get();

        System.out.println(lcm);
    }

    public static void swap(int[]array, int i, int j){
        if (i==j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
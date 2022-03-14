package Search;

import java.util.Arrays;

/**
 * @Description
 * A fast way to search a sorted array is to use a binary search. The idea is to look at the element in the middle.
 * If the key is equal to that, the search is finished. If the key is less than the middle element, do a binary search on the first half.
 * If it's greater, do a binary search of the second half.
 */

public class BinarySearch {
    public static void main(String []args){
        int [] array = new int[] {3,9,4,22,15,16};

        //Sort the array first
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); //[3, 4, 9, 15, 16, 22]

        //Find the element
        System.out.println("Search for 3. Found at index : " + binarySearch(array,3));
        System.out.println("Search for 4. Found at index : " + binarySearch(array,4));
        System.out.println("Search for 22. Found at index : " + binarySearch(array,22));
        System.out.println("Search for 10. Found at index : " + binarySearch(array,10));
    }

    public static int binarySearch(int [] array, int value){
        if (array == null)
            return -1;

        int first =0,midPoint = 0;
        int last = array.length-1;

        while (first < last){
            midPoint = (first + last)/2;

            if (value == array[midPoint])
                return midPoint;
            else if (value > array[midPoint])
                //TODO: IMPORTANT here for (midPoint + 1) => Else case not found, it will looping forever
                first = midPoint +1;
            else
                last = midPoint;
        }
        System.out.println("low" +last);
        return -1;
    }
}

package zProblem.LeetCode;

import java.util.Arrays;

//945. Minimum Increment to Make Array Unique
//https://leetcode.com/problems/minimum-increment-to-make-array-unique/
//https://massivealgorithms.blogspot.com/2018/11/leetcode-945-minimum-increment-to-make.html

public class MinimumIncrementArrayUnique {
    public static void main(String []args){
        int [] array = new int[] { 1,5,3,3,3}; //Array not sorted { 1,3,3,3,5}
        //System.out.println("Number of increments: " + minIncrementForUnique(new int[] { 1,2, 2}));
        System.out.println("Number of increments: " + minIncrementForUnique(new int[] { 1,3,3,3,6,7}));
        //System.out.println("Number of increments: " + minIncrementForUnique(new int[] { 1,1,2,2,3,7}));
    }

    public static int minIncrementForUnique(int[] array) {
        //Contrainst : 1 <= nums.length <= 105. So O(nlogn) is still OK
        //So sorting it will take O(nlogn) which is still acceptable

        // Sort the array.
        // Compared with previous number with condition A[i] <= A[i-1]
        // The current number need to be at least prev + 1.
        Arrays.sort(array);
        int count = 0;
        for (int i= 1; i<array.length; i++){
            if( array[i] <= array[i-1]){ //This condition is for array with multiple duplicate value as 1,3,3,3,6,7
                count += array[i-1] - array[i] + 1;
                array[i] = array[i-1] + 1;
            }
            System.out.println("Array after changing : " +Arrays.toString(array));
        }
        return count;

    }
}
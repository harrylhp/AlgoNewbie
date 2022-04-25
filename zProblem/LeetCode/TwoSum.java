package zProblem.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[]args){
        int[] array = new int[]{9, 7, 3, 8, 1, 6, 7, 10,5,3};

        int[] array1 = new int[]{-3,4,3,0};
        int [] result = findTwoSum(array1, 0);

        System.out.println(Arrays.toString(result));

        int [] result2 = findTwoSumHash(array, 9);
        System.out.println(Arrays.toString(result2));
    }

    // O(n2) as time complexity, too slow !
    public static int[] findTwoSum(int []array, int sum){
        int i=0;
        int j=0;

        for(i=0; i<array.length;i++){
            for(j=0;j<array.length;j++){
                if(i!=j && (array[i]+array[j] ==sum)){
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    //Return indexes of 2 sum
    public static int[] findTwoSumHash(int []array, int sum){
        Map<Integer,Integer> ht = new HashMap<Integer,Integer>();

        for (int i=0; i< array.length; i++){
            int complement = sum - array[i];
            if (ht.containsKey(complement) && ht.get(complement)!=i)
                return new int[] { i,ht.get(complement) };
            else
                ht.put(array[i],i);
        }

        return null;

    }

}


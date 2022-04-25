package zProblem.LeetCode.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {
    public static void main (String []args){
        /*
        int [] nums = new int[] {1,1,2,2,3,3,3,4,4,5,5};
        int k =  removeDuplicatesAppearOnce(nums);
        System.out.println("The new sorted array AppearOnce");
        for(int i = 0 ; i<k ; i++){
            System.out.print(nums[i] + " ");
        }

         */

        int [] nums2 = new int[] {1,2,3,3,3,4,4,5,5};
        System.out.println();
        System.out.println("The new sorted array AtMostTwice");
        int k2 =  removeDuplicatesAppearAtMostTwice(nums2);
        for(int i = 0 ; i<k2 ; i++){
            System.out.print(nums2[i] + " ");
        }
    }

    //1,1,2,2,3,3,3,4,4,5,5 //1,2,1,2,3,3,3,4,4,5,5
    public static int removeDuplicatesAppearOnce(int[] nums) {
        int slow = 1, fast = 1;
        if (nums == null || nums.length ==0)
            return 0;

        for (fast = 1; fast < nums.length; fast++){
            //System.out.println(Arrays.toString(nums));
            //System.out.println("Slow is : "+slow + "Fast is : " +fast);
            if(nums[fast-1] != nums[fast]){
                nums[slow++] = nums[fast];
            }
        }

        return slow;
    }

    //Then we iterate through our data and check if nums[slow - 2] == nums[fast]: what does it mean?
    // It means, that in fact nums[slow-2] = ... = nums[fast] and that we already have group of 3or more equal elements:
    // it this case we understand, that slow place should be rewritten with something else from future, so we do not move it.
    // In other case, we have group of 2 or smaller, so we need to move slow pointer to right.
    // In any case we move fast pointer one place to the right.

    // [Pham] In simple word, determine when this slow pointer needs to stop moving, when group of 3, needs to be replace
    // Else move with fast pointer, then check again in future for any group of 3. Else move again
    public static int removeDuplicatesAppearAtMostTwice(int[] nums) {
        int slow = 2, fast = 2;     //For appear at most 3, slow = fast = 3, nums[slow-3]
        if (nums.length < 3)
            return nums.length;

        for (fast = 2; fast < nums.length; fast++){
            if(nums[slow-2] != nums[fast]) //The condition here is to determine which index you need to swap.
                nums[slow++] = nums[fast];
        }

        return slow;
    }

    //IMPORTANT For General Solution
    //slow = fast = 1 => appear 1
    //for (fast = 1 ; fast < nums.length; fast++
    //        nums[slow -1] != nums[fast] // increase to slow-2, slow-3 for more than number of appearances
    // But for 1 duplicate, it seems nums[fast -1] != nums[fast] easier to understand
}


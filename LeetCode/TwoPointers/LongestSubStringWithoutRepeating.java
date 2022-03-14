package LeetCode.TwoPointers;

import java.util.HashMap;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubStringWithoutRepeating {
    public static void main(String []args){
        System.out.println("Longest substring is : " + lengthOfLongestSubstring("dvdf"));
        System.out.println("Longest substring is : " + lengthOfLongestSubstring("abcdefgg"));
        System.out.println("Longest substring is : " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("Longest substring is : " + lengthOfLongestSubstring("bbbbb"));
        System.out.println("Longest substring is : " + lengthOfLongestSubstring("pwwkew"));

        System.out.println("=======================");
        System.out.println("Longest substring is : " + improvedlengthOfLongestSubstring("abba"));
        System.out.println("Longest substring is : " + improvedlengthOfLongestSubstring("abcddadbcf"));
        System.out.println("Longest substring is : " + improvedlengthOfLongestSubstring("dvdf"));
        System.out.println("Longest substring is : " + improvedlengthOfLongestSubstring("abcdefgg"));
        System.out.println("Longest substring is : " + improvedlengthOfLongestSubstring("abcabcbb"));
        System.out.println("Longest substring is : " + improvedlengthOfLongestSubstring("bbbbb"));
        System.out.println("Longest substring is : " + improvedlengthOfLongestSubstring("pwwkew"));

    }

    //Runtime: 107 ms, faster than 15.72% of Java online submissions for Longest Substring Without Repeating Characters.
    //SLOW SOLUTION O(n2) - Space is O(n)
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 1, count = 1;
        if (s==null || s.isEmpty())
            return 0;

        char [] arrayCh = s.toCharArray();
        int slow = 0, fast = 1;

        for (fast = 1; fast < arrayCh.length; fast++) {
            int index = fast;
            count++;

            while (index > slow) { //NOTE HERE: The starting of slow index not 0
                if (arrayCh[fast] == arrayCh[--index])
                    count = 1;
            }

            if (count == 1) {
                slow++;
                fast = slow;
            } else
                maxLength = Math.max(maxLength, count);
        }
        return maxLength;
    }

    //Can use HashMap for the search
    //O(n) for time complexity, O(n) for space complexity
    public static int improvedlengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;

        //abcddadbcf
        //abba
        HashMap <Character,Integer> hmap = new HashMap<>();
        int maxLength = 0;
        int slow =0, fast = 0;
        for (fast = 0 ; fast < s.length(); fast++){
            if(hmap.containsKey(s.charAt(fast))){
                //TODO: Require Math.max as sometimes found the character which index is smaller than current slow pointer, we should not move back
                //As we don't count that character into longest anymore
                slow = Math.max(slow,hmap.get(s.charAt(fast))+1);
            }
            hmap.put(s.charAt(fast), fast);
            maxLength = Math.max(maxLength, fast - slow + 1);
        }

        return maxLength;
    }
}

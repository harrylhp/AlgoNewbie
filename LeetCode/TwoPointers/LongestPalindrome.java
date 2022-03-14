package LeetCode.TwoPointers;

class LongestPalindrome {

    public static String SearchingChallenge(String str) {
        // code goes here
        String output = "";
        if (str.isEmpty())
            output = "none";

        if (str.length() <= 1)
            output = "none";

        //Solution explaination:
        //For palindrome string, it will start to expand from the middle
        //  Odd String :     fdcbcdf (
        //  Even String :    cboobc (still consider palindrome)
        String oddStr = "" , evenStr = "";

        for (int i=0; i<str.length();i++){
            //Odd String palindrome search, start = end
            oddStr = expandFromMid(str, i , i);
            if (output.length() < oddStr.length()){
                output = oddStr;
            }

            evenStr = expandFromMid(str, i , i+1);
            if(output.length() < evenStr.length()){
                output = evenStr;
            }

        }

       return output;
    }

    public static String expandFromMid(String str, int start, int end){
        while(start>=0 && end < str.length() && str.charAt(start) == str.charAt(end)){
            start--;
            end++;
        }
        return str.substring(start + 1,end); //Inclusive start and exclusive of end for substring
        //After the run it will stop with : start = -1 and end = str.length. => fix start only, no need to fix end

        //start + 1 because after 0 the start will be -1 and the substring method begin index is inclusive.
        // we need not do to end + 1 because right will point  to s.length when it reaches end of string and the substring method end index is exclusive.

    }


    public static void main (String[] args) {
        // keep this function call here
        System.out.println("Test Case 0 : " + SearchingChallenge("alolalhello"));
        System.out.println("Test Case 1 : " + SearchingChallenge("hellol"));
        System.out.println("Test Case 2 : " + SearchingChallenge("helaloola"));
    }

}
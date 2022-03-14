package zProblem.StringPlayAround;

public class LongestOccurChar {
    public static void main(String []args){
        String input = "aaabbaaaaccaadddbbaaaaaaaadddddddd";
        System.out.println("Longest Occuring String " + longestOccurChar(input,'d'));
    }

    public static int longestOccurChar(String str, char ch){
        int max = 0;
        int count = 0;
        char[]array = str.toCharArray();

        for (int i = 0; i< array.length; i++){
            if (array[i] == ch)
                count++;
            else
                count =0;

            if (count > max)
                max = count;
        }
        return max;
    }
}

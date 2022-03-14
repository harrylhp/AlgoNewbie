package zProblem.StringPlayAround;

public class LongestChar {
    public static void main (String[]args){
        String str = "aaabbaaccccddeeefffffff";
        int count = longestCharInSentence(str);
        System.out.println("longest char length is :" + count);
    }

    public static int longestCharInSentence(String str){
        int count =0;
        int max=0;
        char firstChar = str.charAt(0);
        for (int i=0; i<str.length();i++){
            if(firstChar == str.charAt(i)) {
                count++;
                if (i==str.length()-1 && max < count)
                    max = count;
            }
            else{
                if (max<count)
                    max = count;
                count = 1;
                firstChar = str.charAt(i);
            }
        }
        return max;
    }
}

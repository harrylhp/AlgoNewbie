package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackPalindrome {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        StringBuilder lowerCaseStrBuilder = new StringBuilder();
        String lowerCaseStr = string.toLowerCase();

        Stack<Character> stack = new Stack<Character>();
        LinkedList<Character> stackLinkedList = new LinkedList<>();

        for (int i = 0; i < lowerCaseStr.length();i++){
            if ((lowerCaseStr.charAt(i)>= 'a' && lowerCaseStr.charAt(i)<='z')) {
                stack.push((Character) (lowerCaseStr.charAt(i)));
                lowerCaseStrBuilder.append(lowerCaseStr.charAt(i));
                stackLinkedList.push((Character) (lowerCaseStr.charAt(i)));
            }
        }

        StringBuilder reversedStr = new StringBuilder();
        StringBuilder reversedStr2 = new StringBuilder();
        while(!stack.isEmpty()){
            reversedStr = reversedStr.append(stack.pop());
            reversedStr2 = reversedStr2.append(stackLinkedList.pop());
        }
        System.out.println("Reverse String : "+ reversedStr);
        System.out.println("Reverse String 2 :"+ reversedStr2);
        System.out.println("Lower Case String :" + lowerCaseStr);

        if (reversedStr.toString().equals(lowerCaseStrBuilder.toString()))
            return true;

        return false;
    }
}

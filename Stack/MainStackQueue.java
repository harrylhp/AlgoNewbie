package Stack;

import com.sun.prism.impl.QueuedPixelSource;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MainStackQueue {
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
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCaseStr = string.toLowerCase();

        int i;
        for (i = 0; i < string.length(); i++) {
            if ((lowerCaseStr.charAt(i) >= 'a' && lowerCaseStr.charAt(i) <= 'z')) {
                stack.push(lowerCaseStr.charAt(i));
                queue.add((Character) lowerCaseStr.charAt(i));
            }
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop().compareTo(queue.poll()) != 0)
                return false;

        return true;
        }

        return false;


    }
}

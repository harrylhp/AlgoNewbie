package zProblem.LeetCode.Interview;

import java.util.Stack;

/*
    A string is called balanced if it can be represented in the form of “S2[S1]” where S1,S2 is a balanced string
    Example :
        ()()() => balance
        ((())) => balance
        (()( => unbalance
    //Formula : minimum number of swaps = (number of pairs + 1) / 2

 */

public class BalanceParenthesis {
    public static void main(String []args){
        //To use stack to solve the problem, not too optimal
        System.out.println("Minimum swap 1: " + minimumSwapsWithStack ("))()(()(")); //unbalanced
        System.out.println("Minimum swap 2: " + minimumSwapsWithStack("((()))")); //balance
        System.out.println("Minimum swap 3: " + minimumSwapsWithStack("(()())")); //balance
        System.out.println("Minimum swap 4: " + minimumSwapsWithStack("()(())")); //balance
        System.out.println("Minimum swap 5: " + minimumSwapsWithStack(")()(()")); //unbalanced swap 1 and 4
        System.out.println("Minimum swap 6: " + minimumSwapsWithStack(")()(())")); //cannot balance
        System.out.println("Minimum swap 7: " + minimumSwapsWithStack(")))))()(((((")); // balance

        //To solve the problem with
        System.out.println("===============================================");
        System.out.println("Minimum swap 1: " + minimumSwap ("))()(()(")); //unbalanced
        System.out.println("Minimum swap 2: " + minimumSwap("((()))")); //balance
        System.out.println("Minimum swap 3: " + minimumSwap("(()())")); //balance
        System.out.println("Minimum swap 4: " + minimumSwap("()(())")); //balance
        System.out.println("Minimum swap 5: " + minimumSwap(")()(()")); //unbalanced swap 1 and 4
        System.out.println("Minimum swap 6: " + minimumSwap(")()(())")); //cannot balance
        System.out.println("Minimum swap 7: " + minimumSwap(")))))()(((((")); // balance
    }
    public static int minimumSwapsWithStack(String brackets) {
        // Write your code here
        char [] chBrackets = brackets.toCharArray();
        Stack<Character> bracketStack = new Stack<>();

        for (char bracket: chBrackets) {
            if (bracket == '(') {
                bracketStack.push(bracket);
            }
            else { // bracket == ')'
                    if(!bracketStack.isEmpty() && bracketStack.peek() == '(') {
                        bracketStack.pop();
                    }
                    else{
                        bracketStack.push(bracket);
                    }
                }
            }
            //System.out.println(bracketStack);
            int openBracket = 0;
            int closeBracket = 0;
            while(!bracketStack.isEmpty()){
                if(bracketStack.pop() == '(')
                    openBracket++;
                else
                    closeBracket++;
            }
            //System.out.println("Bracket Open : " + openBracket + " Bracket Close : " +closeBracket);
            if (openBracket - closeBracket !=0)
                return -1;
            else
                return (openBracket+1)/2;
    }

    public static int minimumSwap(String brackets){
        int openBracket =0, closeBracket = 0;
        char [] arrayCh = brackets.toCharArray();
        for (int i =0; i < arrayCh.length; i ++){
            if (arrayCh[i] ==  '(')
                openBracket++;
            else{
                closeBracket++;
                if (openBracket > 0) {
                    openBracket--;
                    closeBracket--;
                }
            }
        }
        System.out.println("Open Bracket is : " +openBracket);
        System.out.println("Close Bracket is : " +closeBracket);

        if (openBracket - closeBracket !=0)
            return -1;
        else
            //TODO: This is the formula to count the minimum number of swaps
            return (openBracket+1)/2;
    }
}
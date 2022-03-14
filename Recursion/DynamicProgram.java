package Recursion;

import java.util.Arrays;

public class DynamicProgram {
    public static void main(String[]args){

        //Print out the number at position x
        System.out.println("Fibonacci is " + fibonacci(-1));
        System.out.println("Fibonacci is " + fibonacci(6));

        long preTime=System.currentTimeMillis();
        System.out.println("Value of 42th number in fibonacci series->"+fibonacci(42));
        long postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds (Recursion)->" +(postTime-preTime));

        System.out.println();
        fibArray = new int[43]; //mum + 1 because of fib[num] which is fib[42] -> size should be 43

        preTime=System.currentTimeMillis();
        System.out.println("Value of 42th number in fibonacci series->"+fibonacciMemoization(42));
        postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds (Recursion Memoization)->" +(postTime-preTime));
    }

    // Fibonacci Number: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    // Recursion : Bad recursion, long run-time
    public static int fibonacci(int num){
        if (num < 2)
            return num;

        return fibonacci(num-1) + fibonacci(num-2);
    }

    // Recursion with memoization (dynamic programming) => Reduce runtime
    static int [] fibArray; //Initialization is done in main method
    public static int fibonacciMemoization(int num){
        if (num < 2)
            return num;
            // Important : To not calculate again the fibArray value : Without this one is ok but runtime is still slow
            // The Fibonacci is already calculated and stored inside the array
        else if (fibArray[num] !=0)
            return fibArray[num];
        else // If the array of that Fibonacci is not yet calculated
            return fibArray[num] = fibonacciMemoization(num-1) + fibonacciMemoization(num-2);

    }
}


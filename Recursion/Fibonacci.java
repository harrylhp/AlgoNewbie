package Recursion;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[]args){

        //Print out the number at position x
        System.out.println("Fibonacci is " + fibonacci(-1));
        System.out.println("Fibonacci is " + fibonacci(6));

        System.out.println("Fibonacci Iteratively is " + fibonacciIteratively(0));
        System.out.println("Fibonacci Iteratively is " + fibonacciIteratively(1));
        System.out.println("Fibonacci Iteratively is " + fibonacciIteratively(1));
        System.out.println("Fibonacci Iteratively is " + fibonacciIteratively(6));

        long preTime=System.currentTimeMillis();
        System.out.println("Value of 42th number in fibonacci series->"+fibonacci(42));
        long postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds (Recursion)->" +(postTime-preTime));

        preTime=System.currentTimeMillis();
        System.out.println("Value of 42th number in fibonacci series->"+fibonacciIteratively(42));
        postTime=System.currentTimeMillis();
        System.out.println("Time taken to compute in milliseconds (Iteratively)->" +(postTime-preTime));
    }

    // Fibonacci Number: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    // Recursion : Bad recursion, long run-time
    public static int fibonacci(int num){
        if (num < 2)
            return num;

        return fibonacci(num-1) + fibonacci(num-2);
    }

    // Iterative way
    public static int fibonacciIteratively(int num){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);

        for (int i = 2; i<=num; i ++)
            array.add(array.get(i-1) + array.get(i-2));

        return array.get(num);
    }
}

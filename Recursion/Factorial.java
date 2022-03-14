package Recursion;

public class Factorial {
    public static void main(String[]args){

        System.out.println("Factorial 0 is " + factorial(0));
        System.out.println("Factorial 1 is " + factorial(1));
        System.out.println("Factorial 2 is " + factorial(2));
        System.out.println("Factorial 5 is " + factorial(3));
        System.out.println("Factorial Iteratively is " + factorialIteratively(0));
        System.out.println("Factorial Iteratively is " + factorialIteratively(1));
        System.out.println("Factorial Iteratively is " + factorialIteratively(2));
        System.out.println("Factorial Iteratively is " + factorialIteratively(3));
    }

    public static int factorial(int num){
        //0 -> 1
        //1 -> 1
        //2 -> 2 * 1
        //3 -> 3 * fac(2)
        if (num <= 1)
            return 1;

        return num*factorial(num-1);
    }

    public static int factorialIteratively(int num){
        if (num <= 1)
            return 1;

        int fac =1;
        for (int i = 2; i<= num; i++){
            fac *=i;
        }
        return fac;
    }
}

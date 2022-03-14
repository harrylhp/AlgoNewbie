package zProblem;

public class PlayWithNumber {
    public static void main(String []args){
        String numberStr = "13456";

        System.out.println("First Way to use the StringBuilder");
        StringBuilder strBuild = new StringBuilder(numberStr);
        strBuild = strBuild.reverse();
        System.out.println("Reverse String is : " + strBuild);

        System.out.println("Second Way to use loop");
        int value = Integer.parseInt(numberStr);
        int digit =0;
        int newNumber = 0;
        int size = numberStr.length();
        for (int number = value; number !=0; number /=10){
            digit = number % 10;
            System.out.println("Each number is :" + digit + " " +size);
            //newNumber += (int) (reversedNum * Math.pow(10,(--size)));
            newNumber = newNumber*10 + digit;
        }
        System.out.println("Number is : " +newNumber);
    }

}

package zProblem;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ForAPITesting {
    public static void main(String []args){
        //char[] arrayChar = str.toCharArray();
        //String str = "This is the world&*^ with789 Batman";
        /*
        String str = "This#string%%%%contains^special*characters789&.";
        str = str.replaceAll("[^a-zA-Z]", " ");
        //str = str.replaceAll("\\s" , "");

        System.out.println("Removed Whitespace String : " + str);
        str = str.replaceAll("\\s","");
        System.out.println("Removed Whitespace String : " + str + "String length :  " +str.length());

        String str2 = "Hello World I Am Hero";
        String [] arrStr = str2.split(" ");
        System.out.println("Array is " + Arrays.toString(arrStr));

        String [] arrStr2 = str.split(" ");

        String i = "1";
        if ((Integer)Integer.parseInt(i) instanceof Integer)
            System.out.println("Ya correct");
        //System.out.println("Instance of " + Integer.parseInt(i) instanceof Integer);
        */

        String str = "\u0048\u0065\u006C\u006C\u006F World"; //Hello World presents in the Unicode character
        System.out.println("String is : " + str);

        char [] arrChar = str.toCharArray();
        //byte [] arrCharByte = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(arrChar));
        //System.out.println(arrCharByte);
        System.out.println("End");

    }

    public static String LongestWord(String sen) {
        // code goes here
        String str = sen.replaceAll("[^a-zA-Z\\s]", "");
        System.out.println("New String is : " + str);

        String [] arrStr = str.split(" ");
        System.out.println("Length is " + arrStr.length);

        for (int i = 0; i< arrStr.length - 1; i++){
            if (arrStr[i].length() < arrStr[i+1].length())
                sen = arrStr[i+1];
        }

        return sen;
    }
}

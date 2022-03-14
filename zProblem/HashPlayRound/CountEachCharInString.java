package zProblem.HashPlayRound;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountEachCharInString {
    public static void main (String [] args){
        String str =  "   Hello hallo World";
        HashMap<Character, Integer> hm = new HashMap<>();

        //Remove the space
        str = str.trim();
        str = str.replaceAll("//s++", "");
        System.out.println("The new String is : " + str);

        for (int i =0; i<str.length(); i ++){
            if (hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            else
                hm.put(str.charAt(i), 1);
        }

        for (Map.Entry entry : hm.entrySet())
            System.out.println("Char is : " + entry.getKey() + " = " + entry.getValue());

        int max=0;
        char key = ' '; //Empty Char
        for (Map.Entry entry : hm.entrySet()){
            if (max < (int)entry.getValue()) {
                max = (int) entry.getValue();
                key = (char)entry.getKey();
            }
            //if ((int)entry.getValue() == max)
                //System.out.println("Max Char is : " + entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("Max Char by manual loop : " + key + " = " + max);

    }
}

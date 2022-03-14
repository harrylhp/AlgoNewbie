package zProblem.StringPlayAround;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class StringPlayGround {
    public static void main(String[]args){
        String strToConvert = "this is the world in earth";
        strToConvert = capitalizeFirstLetter(strToConvert);
        System.out.println("String after convert :" + strToConvert);

    }

    public static String capitalizeFirstLetter(String str){
        String [] arrStr = str.split(" ");
        String finalString = "";
        for (int i=0; i<arrStr.length; i++){
            char upperCh = Character.toUpperCase(arrStr[i].charAt(0));
            arrStr[i] = arrStr[i].replace(arrStr[i].charAt(0), upperCh);
            finalString += arrStr[i];
        }

        return finalString;
    }
}

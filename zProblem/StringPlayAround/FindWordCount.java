package zProblem.StringPlayAround;

import java.util.HashMap;
import java.util.Map;

public class FindWordCount {
    public static void main(String []args){
        String str = "Hello World, Welcome to Simplilearn World";
        str = str.replaceAll(",", "");
        System.out.println(str);

        //Replace all special character
        String str2 = "This#string%%%%contains^special*characters&.";
        str2 = str2.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str2);
        //Remove multiple space
        str2 = str2.replaceAll("\\s+"," ");
        System.out.println(str2);

        String [] splitStr = str.split(" ");

        HashMap< String, Integer> hm = new HashMap<>();

        for (Map.Entry entry : hm.entrySet()){
            System.out.println(entry);
        }

        for (int i = 0 ; i < splitStr.length; i++){
            if(hm.containsKey(splitStr[i])){
                hm.put(splitStr[i], hm.get(splitStr[i]) + 1);
            }
            else
                hm.put(splitStr[i], 1);
        }

        hm.forEach((word, count) -> System.out.println(word + "=" + count));
    }
}

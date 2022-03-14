package zProblem.EasyProblem;

public class LongestWord {
    public static void main (String[] args) {
        System.out.println(LongestWord("fun&!! time"));
        System.out.println(LongestWord("hello world hi&!! justice justico32"));
    }

    public static String LongestWord(String sen) {
        // code goes here
        String str = sen.replaceAll("[^a-zA-Z\\s]", "");
        //System.out.println("New String is : " + str);

        String [] arrStr = str.split(" ");

        for (int i = 0; i< arrStr.length - 1; i++){
            if (arrStr[i].length() < arrStr[i+1].length())
                sen = arrStr[i+1];
        }
        return sen;
    }
}

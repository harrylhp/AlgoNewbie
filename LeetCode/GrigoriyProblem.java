package LeetCode;

public class GrigoriyProblem {
    public static void main (String []args){
        System.out.println("Zeus is " + noOfRoundsPrintingString("zeus"));
        System.out.println("Map is " + noOfRoundsPrintingString("map"));
        System.out.println("Ares is " + noOfRoundsPrintingString("ares"));
        System.out.println("D is " + noOfRoundsPrintingString("d"));
        System.out.println("Empty is " + noOfRoundsPrintingString(""));
    }

    public static int noOfRoundsPrintingString(String str){
        char [] array = str.toCharArray();
        char start = 'a';
        int noOfRounds = 0;

        // Find first clockwise round, then find the anti-clockwise => get the minimum
        // anti-clockwise = N (no of elements) - round1
        for (int i = 0; i< array.length; i++){
            int round1 = Math.abs(array[i] - start);
            int round2 = Math.abs(26 - round1);

            noOfRounds += Math.min(round1, round2);
            start = array[i];
        }
        return noOfRounds;
    }
}

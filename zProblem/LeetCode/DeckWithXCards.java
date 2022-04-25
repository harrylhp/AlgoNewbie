package zProblem.LeetCode;

import java.util.HashMap;

public class DeckWithXCards {
    public static void main(String []args){
        System.out.println("Possible Partition : " + hasGroupsSizeX(new int []{1,2,3,4,4,3,2,1}));
        System.out.println("Possible Partition : " + hasGroupsSizeX(new int []{1,1,1,2,2,2,3,3}));
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i =0; i<deck.length; i ++){
            if(hmap.containsKey(deck[i]))
                hmap.put(deck[i], hmap.getOrDefault((deck[i]),0) + 1);
            else
                hmap.put(deck[i], 1);
        }
        System.out.println("Hashmap is : " + hmap.values());

        //TODO: Hashmap is un-index as it's stored according to hashCode <Key> then find value
        int groupSize = hmap.get(deck[0]);
        for (int i : hmap.values()){
            groupSize = Math.min(groupSize,gcd (groupSize,i));
        }

        System.out.println("GCD is : " + groupSize);
        if (groupSize > 1)
            return true;

        return false;
    }

    public static int gcd(int a, int b){
        int gcd = 1;
        for(int i = 1; i<=Math.min(a,b); i++) {
            if (a%i == 0 && b%i==0)
                gcd = i;
        }
        return gcd;
    }
}

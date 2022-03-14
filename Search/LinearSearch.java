package Search;

public class LinearSearch {
    public static void main (String[]args){
        int [] array = new int[] {3,9,4,22,15,16};

        //Linear Search, use for array which is NOT sorted
        System.out.println("Search for 15: " + searchValue(array,15));
        System.out.println("Search for 8: " + searchValue(array,8));
    }

    public static int searchValue(int[] array, int value){
        for (int i = 0; i < array.length; i++){
            if (array[i] == value)
                return i; //return the first index found
        }
        return Integer.MAX_VALUE;
    }
}

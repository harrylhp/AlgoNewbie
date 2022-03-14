package Sorting;

public class InsertionSort{
    public static void main(String[] args) {
        int[] array = new int[]{9, 7, 3, 8, 1, 6, 6, 7, 7};
        int[] array2 = new int[]{10, 7, 3, 7, 1, 6, 6, 2, 7};
        int i,j, key;

        System.out.println("Insertion Sort From Starting Array");
        for (i=1; i<array.length;i++){
            key = array[i];
            j=i-1;

            while(j>=0 && key<array[j]) {
                swap(array, j, j+1);
                j--;
            }
        }

        for (i=0 ; i<array.length;i++)
            System.out.println(array[i]);

        System.out.println("Insertion Sort Starting From Last Array");
        for (i=array2.length-2; i>=0;i--){
            key = array2[i];
            j = i+1;
            while(j<=array2.length-1 && key<array2[j]){
                swap(array2,j,j-1);
                j++;
            }

        }

        for (i=0 ; i<array2.length;i++)
            System.out.println(array2[i]);
    }

public static void swap(int[] array, int i, int j){
        if(i==j)
        return;

        int temp;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        }
}

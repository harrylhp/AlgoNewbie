package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 7, 3, 8, 1, 6, 6, 7, 7};
        int i,j, min;

        for (i=0; i< array.length-1;i++){
            min = i;

            for(j=i+1; j<array.length;j++)
                if(array[min]>array[j])
                    min=j;

            swap(array, i, min);
        }



        for (i=0 ; i<array.length;i++)
            System.out.println(array[i]);

    }

    public static void swap(int[] array, int i, int j){
        if (i==j)
            return;

        int temp;
        temp= array[i];
        array[i]= array[j];
        array[j]=temp;
    }
}

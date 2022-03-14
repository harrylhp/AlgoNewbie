package Sorting;

public class BubbleSort {
    public static void main (String[]args){
        int [] array = new int[]{9,7,3,8,1,6,6,7,7};

        for (int i=0 ; i<array.length;i++)
            for(int j=0; j<array.length-1-i; j++ )
                if (array[j]>array[j+1])
                    swap(array,j,j+1);


        for (int i=array.length-1; i>0; i--)
            for(int j=0; j<i;j++)
                if (array[j]>array[j+1])
                    swap(array,j,j+1);

        for (int i=0 ; i<array.length;i++)
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

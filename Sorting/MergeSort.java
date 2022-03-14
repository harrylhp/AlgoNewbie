package Sorting;

public class MergeSort {
    public static void main (String[]args){
        int[] array = new int[]{9, 7, 3, 8, 1, 6, 7, 10,5};

        mergeSort(array,0,array.length);

        for (int i=0 ; i<array.length;i++)
            System.out.println(array[i]);


    }

    public static void mergeSort(int[]array, int start, int end){
        //Only left with 1 element
        if (end - start <2)
            return;

        int mid = (start + end)/2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);

    }

    //{9, 7, 3, 8, 1, 6, 6, 7, 10,5}
    public static void merge(int[]array, int start, int mid, int end){
        //The array is already sorted
        if(array[mid-1]<array[mid])
            return;

        int tempIndex = 0;
        int [] tempArray = new int[end - start];
        int i = start;
        int j = mid;

        // {9 ,7}
        while (i<mid && j<end){
            tempArray[tempIndex++] = array[i]<=array[j] ? array[i++] : array[j++];
        }

        //Copy the left element (if there is it will be on the left array, if the left is on the right, no need it will be there
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        //Copy the sorted temp array to overwrite the original array
        System.arraycopy(tempArray, 0, array, start, tempIndex);
    }

}

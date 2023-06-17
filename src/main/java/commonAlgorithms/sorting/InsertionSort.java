package commonAlgorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static int[] insertionSort(int[] array){
        if (array.length == 0 || array.length == 1) return array;

        for(int i=1 ; i < array.length ; i++){ // i start with 1 so that j-1 = i-1 is valid
            int j = i;

            while (j > 0 && array[j-1] > array[j]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j--; // move pointer to the head after each swap
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {4,6,8,1,0,9,7,1,9};
        System.out.println(Arrays.toString(insertionSort(array)));
    }

}

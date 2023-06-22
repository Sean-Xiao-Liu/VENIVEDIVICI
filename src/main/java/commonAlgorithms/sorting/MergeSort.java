package commonAlgorithms.sorting;

import java.util.Arrays;

public class MergeSort {


//    public static int[] merge(int[] arrayA, int[] arrayB){
//        int[] mergedArray = new int[arrayA.length+arrayB.length];
//        /**
//         * i pointer in array A
//         * j pointer in array B
//         * k pointer in merged array
//         */
//        int i = 0, j = 0, k =0;
//
//        while(i < arrayA.length && j < arrayB.length){
//            if(arrayA[i] <= arrayB[j]){
//              mergedArray[k] = arrayA[i++];
//            } else {
//                mergedArray[k] = arrayB[j++];
//            }
//            k++;
//        }
//
//        // either arrayA or arrayB is fully added to the merged array
//        while (i < arrayA.length){
//            mergedArray[k++] = arrayA[i++];
//        }
//
//        while (j < arrayB.length){
//            mergedArray[k++] = arrayB[j++];
//        }
//
//        return mergedArray;
//    }
//
//    public static void recursiveSort(int[] array , int begin , int end){
//        if (begin >= end) return;
//        int mid = (begin+end)/2;
//        recursiveSort(array,begin,mid);
//        recursiveSort(array,mid+1,end);
//        array  =merge(Arrays.copyOfRange(array,begin,mid),Arrays.copyOfRange(array,mid+1,end));
//    }
//
//    public static void mergeSort(int[] array){
//        if (array.length < 2) {
//            return;
//        }
//        int mid = array.length / 2;
//        int[] left = new int[mid];
//        int[] right = new int[array.length - mid];
//
//        for (int i = 0; i < mid; i++) {
//            left[i] = array[i];
//        }
//        for (int i = mid; i < array.length; i++) {
//            right[i - mid] = array[i];
//        }
//        mergeSort(left);
//        mergeSort(right);
//        merge(left,right);
//    }


    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }













    public static void main(String[] args) {
        int[] arrayA = {1,3,5,10};
        int[] arrayB = {2,4,6};
        int[] arrayC = {10,5,3,4,7,2,5,7,8,1};
//        System.out.println(Arrays.toString(merge(arrayA,arrayB)));
        mergeSort(arrayC,arrayC.length-1);
        System.out.println(Arrays.toString(arrayC));
    }

}

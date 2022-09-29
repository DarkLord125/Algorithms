package Algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Unsorted Array");
        int[] arr = {23,-1,0,5783,21,3,455,1};
        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
//        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

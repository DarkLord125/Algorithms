package Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Unsorted Array");
        int[] arr = {23, -1, 0, 5783, 21, 3, 455, 1};
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);

    }

    public static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("Ouput");
        System.out.println(Arrays.toString(arr));


    }
}

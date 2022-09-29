package Algorithms;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("The given array is");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Sorting");
        bubblesort(arr);

    }
    static void bubblesort(int[] arr){
        boolean swapped;
        for (int i = 0; i <arr.length ; i++) {
             swapped = false;
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
                System.out.println(Arrays.toString(arr));
                System.out.println(" ");
            }
            if(!swapped){
                break;
            }

        }
    }

}

package Algorithms;

import java.util.Arrays;

public class MinMaxAlgorithm {
    public static void main(String[] args) {
        int[] arr = {23,3,-1,-2,56,89,200,32,-9,-19,43};
        System.out.println("The given array is ");
        System.out.println(Arrays.toString(arr));

        int ans = min(arr);
        System.out.println(ans);

    }
    static int min(int [] arr){
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}

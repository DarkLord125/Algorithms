package Algorithms;

import java.util.Arrays;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {23, 34,78,79,90,99,100,1000,3000};
        System.out.println(Arrays.toString(arr));
        int target = 1000;
        int ans = binarysearch(arr,target);
        System.out.println("index "+ ans);

    }
    static int binarysearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }

}

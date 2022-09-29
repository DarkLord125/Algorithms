package Algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {23,1,56,3,234,67,9,100};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        int ans = linearsearch(arr,target);
        System.out.println("index "+ ans);

    }

    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element==target){
                return i;
            }

        }
        return -1;
    }










}

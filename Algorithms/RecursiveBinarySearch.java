package Algorithms;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {23, 34,78,79,90,99,100,1000,3000};
        int target = 99;
        System.out.println(BS(arr,0,arr.length-1,target));
    }
    static int BS(int[] arr, int s, int e, int target){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m] == target){
            return m;
        } else if (arr[m] > target) {
            return BS(arr,s,m-1,target);
        } else{
            return BS(arr,m+1,e,target);
        }


    }
}

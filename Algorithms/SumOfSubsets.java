package Algorithms;


import java.util.Scanner;

public class SumOfSubsets {
    static int subset_count = 0;

    static void subset_sum(int[] list, int sum, int starting_index, int target_sum)
    {
        if( target_sum == sum )
        {
            subset_count++;
            if(starting_index < list.length)
                subset_sum(list, sum - list[starting_index-1], starting_index, target_sum);
        }
        else
        {
            for( int i = starting_index; i < list.length; i++ )
            {
                subset_sum(list, sum + list[i], i + 1, target_sum);
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n =sc.nextInt();

        System.out.println("Enter the elements");
        int[] list = new int[n];
        for(int i=0; i< list.length; i++){
            list[i] = sc.nextInt();
        }
        System.out.println("Enter the sum");
        int target_sum = sc.nextInt();

        subset_sum(list,0,0,target_sum);
        System.out.println(subset_count);

    }
}

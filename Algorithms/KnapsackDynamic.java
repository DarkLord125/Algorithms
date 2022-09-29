package Algorithms;
import java.util.Scanner;

// 0/1 Knapsack using Dynamic Programming

public class KnapsackDynamic {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Items");
        int n = sc.nextInt();

        //values
        System.out.println("Enter values of each");
        int[] v = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        //weights
        System.out.println("Enter weights of each");
        int[] w = new int[n];
        for (int i = 0; i < w.length; i++) {
            w[i] = sc.nextInt();
        }

        //capacity
        System.out.println("Enter capacity of bag");
        int cap = sc.nextInt();

        int dp[][] = new int[n+1][cap+1];
        for (int i = 1; i < dp.length ; i++) {
            for (int j = 1; j < dp[0].length ; j++) {
                if(j >= w[i-1]){ // sufficient weights
                    int rcap = j -w[i-1]; // remaining capacity in bag

                    if(dp[i-1][rcap] + v[i-1] > dp[i-1][j]){ // capacity for future weights + capacity of current weight > not choosing the current weight + saving capacity for future weights
                        dp[i][j] = dp[i-1][rcap] +v[i-1];
                    }
                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }

            }

        }
        System.out.println("Output");
        System.out.println(dp[n][cap]);
    }
}

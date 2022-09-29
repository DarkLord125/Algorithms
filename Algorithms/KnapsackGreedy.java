package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

// Fractional Knapsack using Greedy Approach

public class KnapsackGreedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Items");
        int n = sc.nextInt();

        //values
        System.out.println("Enter values of each");
        int[] v = new int[n];
        for (int i = 0; i <n; i++) {
            v[i] = sc.nextInt();
        }

        //weights
        System.out.println("Enter weights of each");
        int[] w = new int[n];
        for (int i = 0; i <n ; i++) {
            w[i] = sc.nextInt();
        }

        //capacity
        System.out.println("Enter capacity of bag");
        int cap = sc.nextInt();

        Item[] items = new Item[n];
        for (int i = 0; i <n; i++) {
            double r = v[i]*1.0/w[i];
            Item item = new Item(v[i],w[i],r);
            items[i] = item;
        }
        //ascending order sort on basis of ratios
        Arrays.sort(items);

        double vib = 0;
        int rc = cap;

        //main traversal
        for (int i = n-1; i >=0; i--) {
            if(rc==0){
                break;
            }
            if(items[i].wt <= rc){
                vib += items[i].val;
                rc -= items[i].wt;
            }
            else{
                vib += items[i].val * ((double)rc / items[i].wt);
                rc = 0;
                break;
            }

        }
        System.out.println("Output");
        System.out.println(vib);

    }
    public static class Item implements Comparable<Item>{
        int val;
        int wt;
        double r;

        Item(int val,int wt,double r){
            this.val = val;
            this.wt = wt;
            this.r = r;
        }

        public int compareTo(Item o){
            if(this.r > o.r){
                return 1;
            }
            else if(this.r < o.r){
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}

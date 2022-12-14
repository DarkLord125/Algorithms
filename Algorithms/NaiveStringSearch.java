package Algorithms;

import java.util.Scanner;

public class NaiveStringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.next();
        String pat = sc.next();
        search(txt, pat);
    }

    public static void search(String txt, String pat)
    {
        int M = pat.length();
        int N = txt.length();


        for (int i = 0; i <= N - M; i++) {

            int j;

            for (j = 0; j < M; j++)
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;

            if (j == M)
                System.out.println("Pattern found at index " + i);
        }
    }

}

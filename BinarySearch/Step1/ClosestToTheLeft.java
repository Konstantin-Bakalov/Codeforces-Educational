package BinarySearch.Step1;

// codeforces.com/edu/course/2/lesson/6/1/practice/contest/283911/problem/B

import java.util.Scanner;

public class ClosestToTheLeft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        for(int i = 0; i < k; i++) {
            int x = s.nextInt();
            int l = -1, r = n;
            while(l + 1 < r) {
                int m = (l + r) / 2;
                if(a[m] <= x)
                    l = m;
                else r = m;
            }
            System.out.println(l + 1);
        }
    }
}
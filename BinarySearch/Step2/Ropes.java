package BinarySearch.Step2;

// codeforces.com/edu/course/2/lesson/6/2/practice/contest/283932/problem/B

import java.util.Scanner;

public class Ropes {

    public static boolean f(int[] a, double x, int k) {
        int res = 0;
        if(x == 0) return true;
        for(int i = 0; i < a.length; i++) {
            res += a[i] / x;
        }
        return res >= k;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        double l = 0, r = Math.pow(10, 8);
        for(int i = 1; i < 100; i++) {
            double m = (l + r) / 2;
            if(f(a, m, k)) l = m;
            else r = m;
        }
        System.out.println(l);
    }
}
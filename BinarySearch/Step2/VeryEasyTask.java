package BinarySearch.Step2;

// codeforces.com/edu/course/2/lesson/6/2/practice/contest/283932/problem/C

import java.util.Scanner;

public class VeryEasyTask {

    public static boolean f(int m, int n, int x, int y) {
        int a = m / x;
        int b = m / y;
        return a + b >= n - 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        int l = 1, r = (int) Math.pow(10, 9);
        while(l + 1 < r) {
            int m = (l + r) / 2;
            if(f(m, n, x, y)) r = m;
            else l = m;
        }
        if(n == 1) System.out.println(Math.min(x, y));
        else System.out.println(r + Math.min(x, y));
    }
}
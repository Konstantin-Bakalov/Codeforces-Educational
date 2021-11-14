package BinarySearch.Step1;

// codeforces.com/edu/course/2/lesson/6/1/practice/contest/283911/problem/A

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[k];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        for(int i = 0; i < k; i++) b[i] = s.nextInt();
        for(int j = 0; j < k; j++) {
            int l = 0, r = n - 1;
            int x = b[j];
            boolean ok = false;
            while(l <= r) {
                int mid = (l + r) / 2;
                if(a[mid] == x) {
                    ok = true;
                    break;
                }
                else if(a[mid] < x) l = mid + 1;
                else if(a[mid] > x) r = mid - 1;
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
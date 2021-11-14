package BinarySearch.Step1;

// codeforces.com/edu/course/2/lesson/6/1/practice/contest/283911/problem/D

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FastSearch {

    public static int findL(ArrayList<Integer> v, int x) {
        int l = -1, r = v.size();
        while(l + 1 < r) {
            int m = (l + r) / 2;
            if(v.get(m) < x) l = m;
            else r = m;
        }
        return r;
    }

    public static int findR(ArrayList<Integer> v, int x) {
        int l = -1, r = v.size();
        while(l + 1 < r) {
            int m = (l + r) / 2;
            if(v.get(m) <= x) l = m;
            else r = m;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for(int i = 0; i < n; i++) v.add(s.nextInt());
        Collections.sort(v);
        int k = s.nextInt();
        for(int i = 0; i < k; i++) {
            int l = s.nextInt();
            int r = s.nextInt();
            int L = findL(v, l);
            int R = findR(v, r);
            System.out.print(R - L + 1);
            System.out.print(" ");
        }
    }
}
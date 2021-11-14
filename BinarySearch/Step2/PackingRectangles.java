package BinarySearch.Step2;

// codeforces.com/edu/course/2/lesson/6/2/practice/contest/283932/problem/A

import java.math.BigInteger;
import java.util.Scanner;

public class PackingRectangles {

    public static boolean f(BigInteger w, BigInteger h, BigInteger m, BigInteger n) {
        BigInteger a = m.divide(w);
        BigInteger b = m.divide(h);
        BigInteger res = a.multiply(b);
        return res.compareTo(n) >= 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger w = s.nextBigInteger();
        BigInteger h = s.nextBigInteger();
        BigInteger n = s.nextBigInteger();
        BigInteger max = w.compareTo(h) > 0 ? w : h;
        BigInteger l = BigInteger.ZERO;
        BigInteger r = n.multiply(max);
        while(l.add(BigInteger.ONE).compareTo(r) < 0) {
            BigInteger m = l.add(r).divide(BigInteger.TWO);
            if(f(w, h, m, n))
                r = m;
            else l = m;
        }
        System.out.println(r);
    }
}

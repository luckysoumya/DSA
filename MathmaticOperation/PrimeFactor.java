package MathmaticOperation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static void main(String[] args) {
        int x = 12;
        System.out.println( primeFactor(x));

    }

    public static List<Integer> primeFactor(int x) {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                l1.add(i);
            }


        }
        return isPrime(l1);

    }

    private static List<Integer> isPrime(List<Integer> a) {
        List<Integer> l2 = new ArrayList<>();
        for (int b : a) {
            for (int i = 2; i < b; i++) {
                if (b % i == 0) {
                    l2.add(i);
                }
            }

        }
        return l2;
    }
}

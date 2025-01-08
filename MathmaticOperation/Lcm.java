package MathmaticOperation;

import static java.lang.Math.max;

public class Lcm {
    public static void main(String[] args) {
        int a=4;
        int b=6;
        System.out.println(lcm(a,b));
    }
    public static int lcm(int a,int b) {
        int res = max(a, b);
        while (true) {
            if (res % a == 0 && res % b==0) {
                return res;
            }
            res++;
        }
    }

}

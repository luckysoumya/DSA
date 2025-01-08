package MathmaticOperation;

import static java.lang.Math.min;

public class GCD {
    public static void main(String[] args) {
        int a=4;
        int b=6;
       // System.out.println(gcd(a,b));
        System.out.println(gcdOptimization(a,b));
    }
    static int gcd(int x,int y){
        int result=0;
        int z=min(x,y);
        while(z>0){
            if(x%z==0 && y%z==0){
                break;
            }
           z--;
        }
        return z;
    }
    public static int gcdOptimization(int a,int b){
        if(b==0){
            return a;
        }
        else
            return gcdOptimization(b,a%b);
    }
}

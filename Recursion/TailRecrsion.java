package Recursion;

public class TailRecrsion {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        tailRecurion(n,k);
    }
    public static void tailRecurion(int n,int k){
        if(n==0)
            return;
        System.out.println(k);
        tailRecurion(n-1,k+1);

    }
}

package Recursion;

public class OnetoN {
    public static void main(String[] args) {
        int n=5;
        otoN(n);
    }
    public static void otoN(int n ){
        if(n==0){
            return ;
        }
        otoN(n-1);
        System.out.println(n);

    }
}

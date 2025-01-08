package MathmaticOperation;

public class Palindrome {
    public static void main(String[] args) {
        int x=78987;
        System.out.println(Palindrome.isPalindrome(x));
    }
    private static boolean isPalindrome(int m){
        int rev=0;
        int temp=m;
        while(m>0){

            int s=m%10;
            m=m/10;
            rev=rev*10+s;

        }
        if(rev==temp){
            return true;
        }
        else {
            return false;
        }

    }
}

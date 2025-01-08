package MathmaticOperation;

public class CountDigit {
    public static void main(String[] args) {
        int x=3456;
        CountDigit c1=new CountDigit();

        System.out.println(c1.count(x));
    }
    int count(int x){
        int r=0;
        while(x>0){
            x=x/10;
            r++;
        }
        return r;
    }
}

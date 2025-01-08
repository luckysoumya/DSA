package MathmaticOperation;

public class TrallingzeroOtimizeSolution {
    public static void main(String[] args) {
        int x=5;
        int res=0;
        for(int i=5;i<=x;i=i*5 ){
            res=res+x/i;
        }
        System.out.println(res);
    }
}

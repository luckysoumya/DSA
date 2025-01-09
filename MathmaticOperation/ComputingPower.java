package MathmaticOperation;

public class ComputingPower {
    public static void main(String[] args) {
        int number=2;
        int power=3;
        System.out.println(powerOfNumber(2,3));
    }
    public static int powerOfNumber(int a, int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result=result*a;
        }
        return result;
    }

}

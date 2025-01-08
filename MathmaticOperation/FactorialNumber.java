package MathmaticOperation;

public class FactorialNumber {
    public static void main(String[] args) {
        int x=5;
        System.out.println(factorial(x));
    }
    static  int factorial(int x){
        if(x<=0){
            return 1;

        }
        return x*factorial(x-1);
    }
}

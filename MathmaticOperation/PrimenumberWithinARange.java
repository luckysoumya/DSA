package MathmaticOperation;

public class PrimenumberWithinARange {
    public static void main(String[] args) {
        int a=23;
        for(int i=2;i<=a;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int x){
        for(int i=2;i<Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}

package MathmaticOperation;

public class CheckPrime {
    public static void main(String[] args) {
        int x=65;
        System.out.println(isPrime(x));

    }
    public static boolean isPrime(int x){
        if(x==2){
            return true;
        }
       for(int i=2;i<=Math.sqrt(x);i++){
           if(x%i==0){
               return false;
           }
       }
      return true;
    }

}

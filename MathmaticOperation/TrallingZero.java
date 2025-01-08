package MathmaticOperation;

public class TrallingZero {
    public static void main(String[] args) {
        int x=10;
        System.out.println(trallingZero(x));
    }
    static int trallingZero(int m){
        int ans=1;
        for(int i=2;i<=m;i++){
            ans=ans*i;
        }
        int count=0;
                //while(ans>0){
                    while (ans%10==0) {
                        count++;
                        ans=ans/10;
                    }
        return count;
            }
    }




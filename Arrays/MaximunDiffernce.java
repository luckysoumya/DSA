package Arrays;


import static java.lang.Math.max;

public class MaximunDiffernce {
    public static void main(String[] args) {
        int []a={4,5,7,8,9,10};
        int res=a[1]-a[0];
        for(int i=0;i<a.length;i++){
            for(int  j=i+1;j<a.length;j++ ){
                res=max(res,a[j]-a[i]);
            }

        }
        System.out.println(res);
    }
}

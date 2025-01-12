package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeaderinArray {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        int[] x={4,3,7,11,8,9,8};
     //   arrayLeader(x);
        efficentSolution(x);
//        for(int i=0;i<x.length;i++){
//          if(arrayLeader(x,i)){
//              l1.add(i);
//          }
        }


    public static void  arrayLeader(int[] y) {
        for (int i = 0; i < y.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < y.length; j++) {
                if (y[i] <= y[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(y[i]);

            }

        }
    }
     public static void efficentSolution(int x[]){
       int count=0;
         int arr[]=new int[count];
        int leader=x[x.length-1];
         System.out.println(leader);
        for(int i=(x.length-2);i>=0;i--){
            if(x[i]>leader){
               // s.add(x[i]);
                leader=x[i];
                count++;
                System.out.println(leader);
            }
        }
        // System.out.println(s);


     }
}

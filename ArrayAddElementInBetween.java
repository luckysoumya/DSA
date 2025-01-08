import java.util.Scanner;

public class ArrayAddElementInBetween {
    public static void main(String[] args) {
        int a[]=new int[5];
         a[0]=1;
         a[1]=3;
         a[2]=5;
         a[3]=6;
         a[4]=7;


         int b[]=new int [6];
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int j=sc.nextInt();
        for(int i=0;i< b.length;i++){
            if(i<m){ //1,3
                b[i]=a[i];
            }
            else if (i==m){//10
                b[i]=j;
            }
            else {
                b[i]=a[i-1];
            }



        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}

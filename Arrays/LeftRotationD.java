package Arrays;

public class LeftRotationD {
    public static void main(String[] args) {
      int []x={3,4,5,2,7,8};
      int d=2;
     // leftD(x,d);
        leftRotateD1(x,2,x.length-1);
      for(int m:x){
          System.out.print(m+" ");
      }
    }
    public static void leftRotate(int []n,int d){
        int temp=n[0];
        for(int i=1;i<n.length;i++){
            n[i-1]=n[i];
        }
        n[n.length-1]=temp;

    }
    public static void leftD(int []n,int x){
        for(int i=1;i<=x;i++){
            leftRotate(n,i);
        }

    }
    public static void leftRotateD1(int a[],int low,int high){
        while(low<high){
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;
        }

    }

}

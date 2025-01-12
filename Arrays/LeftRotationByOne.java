package Arrays;

public class LeftRotationByOne {
    public static void main(String[] args) {
        int[] x={2,4,5,6,8,9};
        leftRotate(x);
        for(int b:x){
            System.out.println(b);
        }
    }
    public static void leftRotate(int []b){
        int temp=b[0];
        for(int i=1;i<b.length;i++){
            b[i-1]=b[i];
        }
        b[b.length-1]=temp;
    }
}

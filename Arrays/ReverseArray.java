package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[]={4,6,3,8,9,0};

        reverse(a);
        for(int s:a){
            System.out.print(s);
        }
    }
    public static void reverse(int[] b){
        int low=0;
        int high=b.length-1;
        while(low<high){
            int temp=b[low];
            b[low]=b[high];
            b[high]=temp;
            low++;
            high--;
        }


    }
}

package Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[]={4,6,0,4,0,8,0,5,7,0,5};
        movetoEnd1(arr);
        //System.out.println(arr.toString());
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void moveToEnd(int arr[]){
        for(int i= 0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]!=0){
                        swap(arr,i,j);
                        break;
                    }
                }
            }
        }


    }
    public static void movetoEnd1(int arr[]){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}

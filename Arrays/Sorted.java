package Arrays;

public class Sorted {
    public static void main(String[] args) {
        int arr[]={4,6,8,9,15,5};
        System.out.println(sorted1(arr));


    }
    public static boolean sorted(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){{
                    return false;
                }
                }
            }
        }
        return true;
    }
    public static boolean sorted1(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}

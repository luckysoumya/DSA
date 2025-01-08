public class LargestElementinArray {
    public static void main(String[] args) {
        int arr[]={2,6,3,9,4,7};

        System.out.println(large(arr));


    }
    static int large(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        return largest;
    }
}

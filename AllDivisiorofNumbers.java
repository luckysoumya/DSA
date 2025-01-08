import java.util.ArrayList;
import java.util.List;

public class AllDivisiorofNumbers {
    public static void main(String[] args) {
        int x=100;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=x;i++){
            if(x%i==0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}


import java.util.Arrays;

public class minNum {
    public static void main(String[] args) {
    int[] arr = {13,94,37,8,36,2,1,94};
    System.out.println(min(arr));
    

    }

    static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int minNum = arr[0];
        for(int i =0; i < arr.length; i++ ){
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        return minNum;

    }


}

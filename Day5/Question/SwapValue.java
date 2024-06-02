package Question;

import java.util.Arrays;

public class SwapValue {
    public static void main(String[] args) {
        int[] arr = {1,42,34,67,3,6};

        // swaping(arr,1 , 4);

        Reverse(arr);

        System.out.println(Arrays.toString(arr));//swaping arrays values

    }

    static void swaping(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    // By using swap function we can reverse the array
    static void Reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            // Swaping
            swaping(arr,start,end);
            start++;
            end--;
        }
    }
}

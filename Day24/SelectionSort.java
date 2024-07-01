import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for(int i=0; i< arr.length; i++){
            int last = arr.length - i - 1;
            
            int getMax = Getmax(arr , 0, last);

            swap(arr ,getMax ,last );

        }
    }

    public static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int Getmax(int[] arr, int start , int end){
        int max = start;
        for(int i=0; i<= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }

        }
        return max;
    }
}

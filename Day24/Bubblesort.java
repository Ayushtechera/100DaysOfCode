import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void bubble(int[] arr){
        boolean swapped;

        //run the steps n-1 times
        for(int i = 0; i < arr.length-1; i++){
            swapped = false;
            //for each step, max item will come at the last respective index
            for(int j = 1; j < arr.length - i ; j++){

                // swap the item if it was smaller than the previous one
                if(arr[j] < arr[j-1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;

                }
            }

            //if you did not swap for a particular value of i, it means it is sorted array and hence end the programme
            if(!swapped){
                break;
            }
        }
    }
}

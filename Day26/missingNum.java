// https://leetcode.com/problems/missing-number/description
// Amazon Question

public class missingNum {
    public static void main(String[] args) {

        int[] arr = {4,0,2,1};
        System.out.println(missing(arr));
    }

    public static int missing(int[] arr){
        int i = 0;
        while(i < arr.length){
            int corrextindex = arr[i];
           if(arr[i] < arr.length && arr[i] != arr[corrextindex]){
                swap(arr, i , corrextindex);
           } else {
                i++;
           }
        }

         // Now, the array is sorted so, now search for the missing number

        //  CASE-1
         for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
         }

        //  CASE-2
        return arr.length;
    }

   

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}

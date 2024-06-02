package Question;
//Maximum Value of an Array
public class ToFindMax {
    public static void main(String[] args) {
        int[] arr = {1,234,64,65,345,44334};
    // System.out.println(max(arr));

    System.out.println(maxRange(arr,0,3));
        
    }

    // Imagine that arr is not empty
    // Work on edge cases here, like array being null   
    static int max(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;

        
    }

    // To check Maximum Value between particular index Range:
    // Work on edge cases here
    static int maxRange(int[] arr, int start, int end) {
        if(end < start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for(int i = start; i <= end ; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;

        
    }

    
    

}

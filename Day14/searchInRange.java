
// Search in index range
// arr = {10,5,-6,14,90,21,25}
// Question is to search for 14 in the range of index[1,4]\

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {12,74,-4,70,34,75,25,38,23};
        int target = 34;
        int ans = searchRange(arr, target, 1,7);

        
    }

    static int searchRange(int[] arr , int target , int start , int end ){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index <= end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
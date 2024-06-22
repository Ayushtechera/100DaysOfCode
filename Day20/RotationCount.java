public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));
    }

    public static int countRotation(int[] arr){
        int pivot = FindPivot(arr);
        // if(pivot == -1){
        //     return 0;
        // } //we can remove this if condition because, when the value of pivot is 
        return pivot + 1;  // -1 and in return it will become -1 + 1 = 0 already hence we can remove the if condition
    }

    // Use this for non duplicates elements in array
    public static int FindPivot(int[] arr){
        int start = 0;
        int end =  arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            // 4 CASES will be:
            if(arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid -1;
            }
            if(arr[start] < arr[mid]){
                start =  mid + 1;
            }
        }
        return -1;
    }
    


    // use this when array contains duplicates
    public static int FindPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // There will be 4 cases (Expalanation in Notes)
            //CASE-1
            if(mid < end && arr[mid] > arr[mid+1]){  // we have to keep in mind that when we do mid + 1 then the array should not be out of bound.What if suppose mid is laste element and when it will check for mid+1 then it will array out of bound.So, the mid should always be less than end whenever it is checking for the mid + 1.
                return mid;
            }
            //CASE-2
            if(mid > start && arr[mid] < arr[mid - 1]){ // Similarly mid should always > start
                return mid -1;
            }
            // if elemensts at middle, start , end are equal  then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end] ){
                // just skip the duplicates
                // NOTE : what if these elements at start and end were the pivot?? 
                // check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                // Now check for the end whether the end is pivot or not
                if(arr[end] < arr[end - 1]){
                    return end-1;
                }
                end--;
            }
            // Now we can find for the pivot after removing the duplicates from the array.
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1; // When pivot is not found in the array then return -1.
    }
}

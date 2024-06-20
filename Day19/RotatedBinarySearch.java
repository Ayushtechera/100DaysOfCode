public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = FindPivot(arr);
        System.out.println(ans);
    }

    public int search(int[] nums, int target) {
        int pivot = FindPivot(nums);

        
        // if you do not find pivot,it means array is not rotated
        if(pivot == -1){
            // Perform simple binary search 
            return binarySearch(nums ,target, 0 , nums.length-1);
        }
        // if pivot is found, we have 2 ascending order arrays

        // And there's going to be 3 cases are as follows:-
        //CASE-1
        if(nums[pivot] == target){
            return pivot;
        }
        //CASE-2
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target,pivot-1, nums.length-1);
    }

     public static int binarySearch(int[] arr , int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                return mid;
            }
               
        }
        return -1;
    }

    public static int FindPivot(int[] arr){
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
            //CASE-3
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            //CASE-4
            if(arr[start] < arr[mid]){
                start = mid + 1;
            }
        }
        return -1; // When pivot is not found in the array then return -1.
    }
}

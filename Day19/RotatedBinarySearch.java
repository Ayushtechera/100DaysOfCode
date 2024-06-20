public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = FindPivot(arr);
        System.out.println(ans);
    }

    public int search(int[] nums, int target) {
        int pivot = FindPivot(nums);

        // if you do not find pivot 
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

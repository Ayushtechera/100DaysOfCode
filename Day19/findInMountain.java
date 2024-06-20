public class findInMountain {


    // Question 7:- 
    // https://leetcode.com/problems/find-in-mountain-array/description/
    // Explanation in notebook
     
    public static void main(String[] args) {
        
    }

    int search(int[] arr, int target){
        int peak = findPeakElement(arr);
        int firsttry = OrderAgnosticBS(arr , target , 0 , peak);

        if(firsttry != -1){
            return firsttry;
        }
        return OrderAgnosticBS(arr , target, peak +1, arr.length-1);
    }



    int OrderAgnosticBS(int[] arr, int target , int start , int end){
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAscending){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]){
                    end =  mid -1; 
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    
    public static  int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid =  start + (end - start)/2;

            if(nums[mid] > nums[mid+1]){
                // you are in descending side of array
                // this may be the ans, but looking in left side for better and perfest answer.
                // this why end != mid - 1
                end = mid;
            }else{
                // you are in ascending part of array
                start = mid + 1; // because we that mid + 1 element is greater than mid element.
            }
        }
        // in the end, start == end and pointing  to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        //hence, wehen they are pointing to just one element , that is the max element because that is what the checks says
        //more elaboration: at every point for start and end they have the best possible answer till that time and if we are saying that only
        // one item is remaining hene because of above line that is the best answer.
        return start; // we can return start as well as end because both are pointing to the ans
    }

    // public static int binarySearch(int[] arr, int target , int start , int end){

    //     while(start <= end){
    //         int mid =  start + (end - start)/2;
    //         if(target > arr[mid]){
    //             start = mid + 1;
    //         }else if(target  < arr[mid]){
    //             end = mid - 1;
    //         }else{
    //             return mid;
    //         }            
    //     }
    //     return -1;
    // }
}



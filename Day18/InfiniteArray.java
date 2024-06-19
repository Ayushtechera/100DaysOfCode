public class InfiniteArray {
    //Amazon question :- Find the element from the infinite element array in ascending order.
    // Question 5 :- Approach in notebook but brief is we are not using the arr.length function and since
    // it is the array of infinite element in ascending order.So, we are brekaing the array into small chuncks(array) and finding the targeted element in that particular chunck or array.
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(searchRange(arr, target));

    }

    static int searchRange(int[] arr, int target){
        // first finding the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range,More in notes                                            
        while(target > arr[end]){
            int NewStart = end + 1;
            // double the box value formula explanation in notebook
            // end =  previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = NewStart; //  we assinging the new start here in because we have used the old start in end/ and we can't update the start before using it in formula.
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target , int start , int end){
        // int start = 0;
        // int end  = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

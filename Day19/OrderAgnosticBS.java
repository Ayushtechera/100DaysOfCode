public class OrderAgnosticBS {
    public static void main(String[] args) {
        
    }

    int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
}
public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {100,78,67,43,22,13,12,10,8,4};
        int target = 4;
        int ans = orderAgnosticBS(arr , target);
        System.out.println(ans);
    }
           

    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]) {

                    end = mid + 1;
    
                 }else{
    
                    start = mid -1;
    
                }

            }else{
                if (target > arr[mid]) {

                    end = mid - 1;
    
                 }else{

                    start = mid + 1;
                }

            }
            
        }
        return -1;
    }
}

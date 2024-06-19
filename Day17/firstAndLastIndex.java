import java.util.Arrays;

public class firstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    } 

    static int[] search(int[] arr , int target){
        int[] ans = {-1,-1};

        int first = returnIndex(arr, target, true);
        int second = returnIndex(arr, target, false);

        ans[0] = first;
        ans[1] = second;

        return ans;
    }

    static int returnIndex(int[] arr , int target, boolean WantToFirstOccurence){
        int start = 0;
        int end =  arr.length - 1;
       
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(target < arr[mid]) {
                end = mid - 1;
            
            }else if(target > arr[mid]) {
                start = mid + 1;

            }else {
                ans = mid;
                if(WantToFirstOccurence){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
        
    }
}

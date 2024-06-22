public class splitArray {
    public static void main(String[] args) {
        
    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length-1; i++){
            start = Math.max(start, nums[i]);  // in the end it will contain the maximum element from the array.
            end += nums[i];
        }

        //binary search
        while(start < end){
            //try for middle for potential answer
            int mid = start + (end - start)/2;

            //calculating how many pieces we can divide this in with this maximum sum

            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if(sum + num > mid){
                    // if sum + num > mid hence you can't insert more element in this array because if we add it can cross the max limit so create new subarray                                                                                   
                    // so, shift the number into next array / make new piece
                    sum = num;
                    pieces++; // because we are making new subarray
                }else{
                    sum += num;
                }
                         
            }  
            
            
            if(pieces > m){
                start = mid + 1;
            }else{
                end =  mid;
            }

            

        }
        return end; // beacuse end == start

    }
                            
}

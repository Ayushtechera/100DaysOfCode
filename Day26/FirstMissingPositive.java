// https://leetcode.com/problems/first-missing-positive/description/

public class FirstMissingPositive {
    public static void main(String[] args) {
        
    }
    public int firstMissingPositive(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i , correct);
            }else{
                i++;
            }
        }
        for(int index=0; index<nums.length; index++){
            if(nums[index] != index + 1){
                return index+1;
            }
        }

        // CASE-2
        return nums.length + 1;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

   

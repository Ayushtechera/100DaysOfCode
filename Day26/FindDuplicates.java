// https://leetcode.com/problems/find-the-duplicate-number/

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));                      
    }

    static List<Integer> findDuplicates(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index + 1){
                ans.add(arr[index]);
            }else{

            }
        }
        return ans;
    }

    
    static void swap(int[] nums,int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}

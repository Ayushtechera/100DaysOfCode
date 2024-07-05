// https://leetcode.com/problems/set-mismatch/submissions/1308705184/

public class SetMistMatch {
    public static void main(String[] args) {
        
    }

    static int[] search(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int index=0; index<arr.length;index++){
            if(arr[index] != index + 1){
                return new int[]{arr[index] , index + 1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] nums,int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}

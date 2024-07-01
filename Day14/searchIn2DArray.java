
import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {14,58,23,348},
                {23,94,94},
                {25,02,62,56},
                {1,9,0}
        };
        int target = 02;
        int[] ans = search(arr, target);
        // System.out.println(Arrays.toString(ans));
        System.out.println(MAXsearch(arr));

        
    }

    static int[] search(int[][] arr , int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};


                }
            }    
        }
        return new int[]{-1,-1};
    }

    static int MAXsearch(int[][] arr){
        int MAX = Integer.MIN_VALUE;
        for (int[] element : arr) {
            for(int col = 0; col < element.length; col++){
                if(element[col] > MAX){                                         
                    MAX = element[col];
                }
            }    
        }
        return MAX;
    }




}

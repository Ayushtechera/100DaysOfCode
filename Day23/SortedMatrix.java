import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        

        System.out.println(Arrays.toString(search(arr, 100)));    
    }

    // Search in provided row in between the given columns
    static int[] BinSearch(int[][] matrix , int target , int row, int cStart, int cEnd){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] > target){
                cEnd = mid - 1;
            }else{
                cStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }


    static int[] search(int[][]matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;  

        if(row == 1){
            return BinSearch(matrix, target, 0,0,col-1);
        }

        int rStart = 0;
        int rEnd = col-1;
        int cMid = col /2;


        while(rStart < (rEnd - 1)){ // while this condition remains true it will have more than 2 rows

            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] > target){
                rEnd = mid;
            }else{
                rStart = mid;
            }
        }


        //Now we have 2 rows and check whether the target is in the col of those 2 rows.

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] ==  target){
            return new int[]{rStart + 1, cMid};
        }

        // Now check in those 4 side as discussed in notes

        // side1
        if(matrix[rStart][cMid-1] >= target){
            return BinSearch(matrix, target, rStart, 0, col-1);
        }
        if(matrix[rStart][cMid+1] <= target && target <= matrix[rStart][col-1]){
            return BinSearch(matrix, target, rStart, cMid+1, col-1);
        }
        if(matrix[rStart+1][cMid - 1] >= target){
            return BinSearch(matrix, target, rStart+1,0,cMid-1);
        }else{
            return BinSearch(matrix, target, rStart+1,cMid+1 , col-1);
        }
    }
}

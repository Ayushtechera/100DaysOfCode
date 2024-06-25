public class BasicSearchInMat {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target =5;

        int[] ans = search(matrix, target);

        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] search(int[][] matrix, int target){

        for(int row = 0; row < matrix.length; row++){
            for(int col=0; col < matrix[row].length; col++){
                if(matrix[row][col] == target){
                    return new int[]{row,col};
                }

            }

        }
        return new int[]{-1,-1};
    }
}

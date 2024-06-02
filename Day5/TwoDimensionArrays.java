//2D Arrays

import java.util.Arrays;


public class TwoDimensionArrays {
    public static void main(String[] args) {
      /* 
        1 2 3
       4 5 6
       7 8 9 
         
      */

    // int[][] arr = new int[3][];//adding rows is mandatory but adding columns is not mandatory,because when it is store in heap memory each row is stored in the form of separate array that's why it is mandatory to tell row value because according to that it will store spcae in heap but coloumns in each array can be variable.Hence,the size of individual rows does not matter.
    //And your arrays can be like this also
    int[][] arr2D = {
      {1,2,3},// At 0th index
      {4,5},// At 1st index
      {6,7,8,9}// At 2nd index --> arr2D[2][0]--> will return 6.
      };

      System.out.print(Arrays.toString(arr2D[2]));
    }
}

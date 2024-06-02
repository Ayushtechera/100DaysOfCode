package TakingInput;

import java.util.Scanner;
import java.util.Arrays;

public class Input{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int[][] arr = new int[3][3];
        // System.out.println(arr.length);//it will return the no. of rows.


        //input


        for(int row = 0; row < arr.length; row++){
            //for each columns in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        

        //Output Method-01

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


        // //Output Method -02

        // for(int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }


        // //Output Method -03
        //Enhanced for loop to print output 
        // for(int[] a : arr){ //for every element in array, print the element 
        //     System.out.println(Arrays.toString(a));//here a represents elements of the array.
        // }
    }
}
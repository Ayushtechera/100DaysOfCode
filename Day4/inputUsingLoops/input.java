package inputUsingLoops;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class input{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        //manual and difficult method to give input when size iof array is large
        //Array of Primitives
        // arr[0] = 23;
        // arr[1] = 34;
        // arr[2] = 532;
        // arr[3] = 124;
        // arr[4] = 1255;
        // [23,34,532,124,1255] the array will look like this.
        // System.out.println(arr[3]);


        //now giving input using for loops in simpler manner.

        // for(int i = 0; i < 5; i++){
        //     System.out.print("enter the value " +  i +" index value:");
        //     arr[i] = in.nextInt();
        // }
        //Now printing the input values that we have given by using forloop only:
        // for(int i = 0; i < 5; i++){
        //     System.out.print(arr[i]+" ");//output will be:[X,X,X,X,X]
        // }
        //now enhance for loop to print the given value in array:

        // for(int num : arr){// for every element in array,print the element
        //     System.out.print(num + " ");// here num represents elements of the arr
        // }

        // System.out.println(arr[5]);// index out of bound error 


        //NOW MOST EASY WAY TO PRINT ARRAYS

        // System.out.println(Arrays.toString(arr));
        // output will be:[x,x,x,x,x]

        //Array of object

        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str)); 

        //modifying
        str[0]="Ayushkashyap";
        System.out.println(Arrays.toString(str));





    }


}
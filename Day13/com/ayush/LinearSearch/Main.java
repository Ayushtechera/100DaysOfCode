package com.ayush.LinearSearch;

public class Main {
    public static void main(String[] args) {

        int[] arr = {24,64,78,3,88,70,25,75,1,6,86,3};
        int target = 100;
        int ans = linearsearch(arr, target);
        System.out.println(ans);
        
    }


    static int linearsearch(int[] arr , int Target){
        if(arr.length == 0){  // If there was no element in array that menas lenght = 0 then it will return -1.
            return -1;
        }
        
        // Running a for Loop to check the target if it present in that array or not.
        for(int i=0; i < arr.length; i++){
            int element = arr[i];
            if(element == Target){
                return i;
            }
        }
        // this return statement will execute when none of the above return statement will execute.
        // hence the target is not present in the array. 
        return -1; //Here we can use -1 because -1 index is not present in the array.
    }

    // Searching the element and printing the element itself and we are not using the -1 if element is not present in the array,ecause -1 can also be the element of the array.
    static int linearsearch2(int[] arr , int Target){
        if(arr.length == 0){  // If there was no element in array that menas lenght = 0 then it will return -1.
            return -1;
        }
        
        // Running a for Loop to check the target if it present in that array or not.

        // now in linearsearch 2 we dont want the index we want the element itself.
        for(int i=0; i < arr.length; i++){
            int element = arr[i];
            if(element == Target){
                return element;
            }
        }
        // this return statement will execute when none of the above return statement will execute.
        // hence the target is not present in the array. 
        return Integer.MAX_VALUE;
    }

     // Searching the target and returning it in true or false;
    static boolean linearsearch3(int[] arr , int Target){
        if(arr.length == 0){  // If there was no element in array that menas lenght = 0 then it will return -1.
            return false;
        }
        
        // Running a for Loop to check the target if it present in that array or not.

        // now in linearsearch 2 we dont want the index we want the element itself.
        for(int i=0; i < arr.length; i++){
            int element = arr[i];
            if(element == Target){
                return true;
            }
        }
        // this return statement will execute when none of the above return statement will execute.
        // hence the target is not present in the array. 
        return false;
    }
}

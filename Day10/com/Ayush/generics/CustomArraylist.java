package com.Ayush.generics;

import java.util.ArrayList;
import java.util.Arrays;


public class CustomArraylist{

    // How the Arraylist work internally:
    // We keep on add on things in it and at particular time when arraylist gets full,
    //it doubles the size of Arraylist and copy all the elements from previous arraylist and pased it in new Arraylist.  

    private int[] data;    // Making all the variable private and hence we can not change the array directly.(Only with the help of getters and setters)
    private static int DEFFAULT_SIZE = 10;
    private int size = 0; // size is also working as the index

    public CustomArraylist() {   // Creating array of deffault size
        this.data = new int[DEFFAULT_SIZE];
    }

    public void add(int num){  // This method is used to add elements in array and check whether the array is full and when it is full then calling resize method.
        if(isFull()){
            Resize();
        }
        data[size++] = num; // Here in this line we are adding the new elements in array at a certain index.
    }

    private void Resize(){   // Here we are increasing the size of the array by doubling it 
        int[] temp = new int[data.length * 2];

        // Here we are copying the previous element and pasting it in a new array.
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp; // When the function is over, then the temp will go out of the scope and finished, but the the data is not inside the function, data is outside the function(Data is instance variable).

    }

    private boolean isFull(){ // Here in this line  we are checking the array is full or not.
        return size == data.length;
    }

    public int removed(){   // In this method we are not actually deleteing the value we are just removing the value from the array. 
        int removed = data[--size]; // [--size] this means ex- data = [678236] here size is 5 and when we do --size it will decrease to 4 and 5th item is removed and can be overridden.
        return removed;
    }

    public int get(int index){ // Method returning the index value 
        return data[index];
    }

    public int size(){ // Method returning the size of the array
        return size;
    }

    public void set(int index , int value){ // setting the value at a custom index value.
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist Data=" + Arrays.toString(data) +"]"+ "[size=" + size + "]";
    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        // list.add(3);
        // list.add(7);
        // list.add(8);
        for(int i=0; i <= 9; i++){
            list.add(2 * i);
        }
        System.out.println(list);
        // So, the problem with CustomArraylist is that,by deffault internally its a integer array only so the arraylist that we are creating can only store the integer value only, but it's not true for the arraylist in arraylist we can store(characters,custom data type etc.)
        // Here comes the concepts of generics.

        ArrayList<Integer> list2 = new ArrayList<>(); // <Integer> - this is generics, this makes sure that you're going to add only integer in it.
        // list2.add("sflbhg"); // It will not allow us to add string in it, because it's generics is Integer.
    }
}

 
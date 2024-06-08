package com.Ayush.generics;

import java.util.ArrayList;
import java.util.Arrays;


// WildCards help in restricting the generics
// Syntax will class name<? extends Super class> 
// Here T should be Number or its Subclasses of superclass like Number is a super class of int,float,double etc.
public class WildCards<T extends Number>{

    // How the Arraylist work internally:
    // We keep on add on things in it and at particular time when arraylist gets full,
    //it doubles the size of Arraylist and copy all the elements from previous arraylist and pased it in new Arraylist.  

    private Object[] data;    // Making all the variable private and hence we can not change the array directly.(Only with the help of getters and setters)
    private static int DEFFAULT_SIZE = 10;
    private int size = 0; // size is also working as the index

    public WildCards() {   // Creating array of deffault size
        this.data = new Object[DEFFAULT_SIZE];
    }

    // public void getList(List<Number> list){ // Here you can only pass the number type like int,float,double etc.You cannot pass the subclass of number here.
    //     // Do Something
    // }

    // public void getList(List<? extends Number> list){ // If you want to pass number type in the subclass of it as well then do it like this
    //     // Do something
    // }

    public void add(T num){  // This method is used to add elements in array and check whether the array is full and when it is full then calling resize method.
        if(isFull()){
            Resize();
        }
        data[size++] = num; // Here in this line we are adding the new elements in array at a certain index.
    }

    private void Resize(){   // Here we are increasing the size of the array by doubling it 
        Object[] temp = new Object[data.length * 2];

        // Here we are copying the previous element and pasting it in a new array.
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp; // When the function is over, then the temp will go out of the scope and finished, but the the data is not inside the function, data is outside the function(Data is instance variable).

    }

    private boolean isFull(){ // Here in this line  we are checking the array is full or not.
        return size == data.length;
    }

    public T removed(){   // In this method we are not actually deleteing the value we are just removing the value from the array. 
        T removed = (T)(data[--size]); //Typecasting it because assing bigger to smaller. [--size] this means ex- data = [678236] here size is 5 and when we do --size it will decrease to 4 and 5th item is removed and can be overridden.
        return removed;
    }

    public T get(int index){ // Method returning the index value 
        return (T)data[index];
    }

    public int size(){ // Meth1od returning the size of the array
        return size;
    }

    public void set(int index , T value){ // setting the value at a custom index value.
        data[index] = value;  // Typecasting not required because we are adding smaller in bigger one.
    }

    @Override
    public String toString() {
        return "CustomArraylist Data=" + Arrays.toString(data) +"]"+ "[size=" + size + "]";
    }
    public static void main(String[] args) {
    //WildCards<String> list3 = new WildCards<>(); // It will through error because String is not a subclass of Number.
    }
}
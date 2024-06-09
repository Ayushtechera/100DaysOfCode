package com.Ayush.generics.LmabdaFunction;

import java.util.ArrayList;
import java.util.function.Consumer;

// Topic -  Lambda Function
// Lambda funcitons are one line functions
// When you have a single line of function then you can convert it in lambda.
public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<5; i++){
            arr.add(i + 1);
        }

        // Writing lambda expression for every item in arr in just one single line
        // item means every single element in arrray.
        //((item)) this is parameter
        //->System.out.println(item*2) this is the body of the function.
        // arr.forEach((item) -> System.out.println(item * 2));

        // We can also do it by using consumer type also

        Consumer<Integer> fun = (item)->System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a,b) -> (a+b);
        Operation product = (a,b) -> (a*b);
        Operation subtraction = (a,b) -> (a-b);


        LambdaFunctions mycalculator = new LambdaFunctions();
        System.out.println(mycalculator.operate(5,5,sum));
        System.out.println(mycalculator.operate(2,5,product));
        System.out.println(mycalculator.operate(3,9,subtraction));
    }

    private int operate(int a, int b, Operation op){
        return op.operations(a,b);
    }

    
}

// creating lambda function using multiple parameter.

interface Operation{
    int operations(int a, int b);
}

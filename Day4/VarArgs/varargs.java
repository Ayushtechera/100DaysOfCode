package VarArgs;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        // fun(25,5,54,54,235,46,342,54,2,535);//varibale length argument can contain variable number of arguments as input, and it will internally store it in an array.
    }
    static void fun(int ...v){//v is like implicitly decalared as an array of type int.
        System.out.println(Arrays.toString(v));
    }
    
    //How to take multiple arguements for example:
    static void multiple(int a, int b,int ...v){

    }
    

    // example 2

    static void multiple(int a, int b, String ...v){//variable length parameter should always be at last position of the list.

    }

}

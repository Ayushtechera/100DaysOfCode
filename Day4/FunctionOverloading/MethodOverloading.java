package FunctionOverloading;

public class MethodOverloading{
    public static void main(String[] args) {
        fun(68);
        fun("Ayush kashyap");
    }
    
    static void fun(int a){
        //when we give int argument then it will choose this mehtod.
       System.out.println(a);
    }



    static void fun(String a){
        //when we give string argument then it will choose this method.
        System.out.println(a);
    }

 
    /*out of two condition one condition should be satisfied:-

    1st-number of arguments should be different
    2nd-type of argument should be dfferent.

     */

}

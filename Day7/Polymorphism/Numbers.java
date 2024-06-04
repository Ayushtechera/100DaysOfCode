package Polymorphism;
// And in this code we are doing method overloading on function name sum.
// Method overloading: Function with same name and different arguments, parameters, type , ordering of types
public class Numbers {
    double sum(double a, int b){// Since a is a type of double and when you pass integer other than double then java will auto typecast is to integer
        return a + b;
    }

    // int sum(int a, int b){ // If this function is present here then it would access this one.
    //     return a + b;
    // }

    int sum(int a, int b, int c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(1,4,2);
        obj.sum(3,5); // Since we have pass the integer in place of double then java will auto typecast it.

    }
    
}

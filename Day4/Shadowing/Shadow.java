package Shadowing;

public class Shadow {
    static int x = 90;// this will be shadowed at line 8 beacause low level scope overrides the high level scope.
    public static void main(String[] args) {
        int x;//the class variable at line 4 is shadowed by this.
        // System.out.println();//shadowing scope will begin only when value is initialised.
        x = 40;//
        System.out.println(x);//x=40,hence low level scope overriding the high level scope.
        fun();
    }

    static void fun(){
        System.out.println(x);//for this statement the value of x remain same as x = 90.
    }
        
   
}

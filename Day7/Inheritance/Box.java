package Inheritance;
//    public final class Box{ // when we add final in class or we finalise the class after finalising we cannot inherit that class in other class and after finalising the class its all methods also get finalise implicitly.
    public class Box {
    private double l;
    double w;  
    double h;


    static void greeting() {
        System.out.println("Hey,I am in box class. Greetings!");
    }


    public double getL() {
        return l;
    }

    
    Box () {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box (double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box (double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;

    }

    public void info(){
        System.out.println("Box is running");
    }

                      
}
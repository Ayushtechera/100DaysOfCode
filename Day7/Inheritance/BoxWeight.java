package Inheritance;
public class BoxWeight extends Box {
    double weight;
    
    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public BoxWeight (double l,double w,double h, double weight){
        super(l,w,h); // "super" keyword is used when you initialise the variable of parent class from child class.
        this.weight = weight;
        // Although the child class includes all the member of superclass(Parent class) but it will not be able to access those memebers of parents class that have decalared as private.
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}

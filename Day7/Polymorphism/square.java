package  Polymorphism;

public class square extends Shapes{
     // this will run when obj of circle is created
    // hence it is oveririding the parent method
    @Override //  this is called annotation
    void area(){
        System.out.println("Ar is square of sides");
    }
}
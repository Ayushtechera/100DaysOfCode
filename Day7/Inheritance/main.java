package Inheritance;

public class main {
    public static void main(String[] args) {
        // Calling different constructor from Box class according to different parameters in constructor
        Box box1 = new Box(10,64,654);

        box1.getL();
        // Box box2 = new Box(box1);
        // System.out.println(box2.l+ " " + box2.w+" "+box2.h);



        // BoxWeight box3 = new BoxWeight();
        // System.out.println(box3.weight); 
        // BoxWeight box4 = new BoxWeight(4,5,6,19);
        // System.out.println(box4.w+" "+box4.h+" "+box4.weight);

        // Box box5 = new BoxWeight(4,3,6,7);
        // System.out.println(box5.w);// here in this we cannot access the box5.weight because.
        // //It is actually the type of the reference variable and not the type of the object that determines what members can be accessed.and here box class does not contain weight property in it.



        // there are many variables in both the parent and child class
        // you are given access to variables that are int the ref type i.e BoxWeight.
        // hence, you should have the access to weight variable
        //this also means,that the ones you are trying to access should be initialised
        //but here, when the obj itself is of type parent class, how will you call the constructor of child class 
        //this is why it is showing error
        // BoxWeight box6 = new Box(4,5,6,7);
        // System.out.println(box6);

        // BoxPrice box = new BoxPrice(20,50,200);

        // box1.greeting();

        BoxWeight box =  new BoxWeight();
        box.greeting(); // You can inherit but you can't override
    }
}

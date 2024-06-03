package staticexample;

// this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a = 5;
    static int b;

    // Static block is execute only once when class is loaded
    static{

        System.out.println("I am in staticBlock");
        b = a * 3;
    }
    
    public static void main(String[] args){
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);                                       

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+ " " + StaticBlock.b);



    }
}

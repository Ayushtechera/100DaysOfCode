package Scoping;

public class Functionscope {
    public static void main(String[] args) {
        int a =10;//initial 
        int b =45;
        String name = "Ayush";
        {
            // int a = 35;// Already initialised outiside the block in the same method,hence you cannot initialised again
            a = 100;//reassign the original ref varibale to some other value
            int c =99;//value initialised in this block,will remain in block.
            name = "rahul";
            System.out.println(name);
        }
        // System.out.println(c);//cannot be use outside the block
        System.out.println(name);
    }
    

    static void random(){
        // System.out.println(a); 
    }

   
    
}

//loop Scope
//Block Scope learn from notes
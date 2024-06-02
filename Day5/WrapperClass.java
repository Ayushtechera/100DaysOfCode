public class WrapperClass {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 13;
        // by using Integer(Wrapper class) we can use primitive as object
        // Integer num = 24;// It is not primitive it is now object of type Integer.....called Wrapper Class.
        // // swap(a,b); // It will not change because it is a final class
        // System.out.println(a + " " + b);



        // Final Keyword :- It prevent your content to be modify,we can make it constant using final keyword.

        // final int  SALARY = 2000;
        // SALARY = 5000;// Hence it will not change the SALARY because it is fixed by final keyword
        // final A ayush = new A("Ayush Kashyap");
        // ayush.name = "other name";// You can change the value but you cannot reassign

        // When a non primitive is final, you cannot reassign it
        // ayush  =  new A("new object");

        A obj;

        for(int i = 0; i < 1000000000; i++) {
            obj = new A("random name");
        }
    } 
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    } 
    
}

class A {
    final int NUM = 10; // Final variable have to be instialised if it is not initialised it will give an error So, always initilised whiel decalaring it.
    String name;

    public A(String name) {
        // System.out.println("object is created");
        this.name = name;
    }
     

    //Every class can have their own finalize method So, that if any object of class is freed from the memory it will call it's  finalize mathod.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}



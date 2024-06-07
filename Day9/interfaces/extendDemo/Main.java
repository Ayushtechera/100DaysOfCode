package interfaces.extendDemo;

public class Main implements A , B {

    // this is known as extended interface where A interface is extended by B interface through
    // extends keyword and and when we implement interface in class then we have to override all the methods used in implemented interface as well as extended one.
    @Override
    public void Greet() {
        
    }

    @Override
    public void fun() {
        
    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
    

}

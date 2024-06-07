package interfaces.extendDemo;

public interface A {
// static interface methods should always have a body
// and call via the interface name
static void greeting(){
    System.out.println("Hi i am a static method");
}

default void fun() {
    System.out.println("I am in A");                                                                   
}
}

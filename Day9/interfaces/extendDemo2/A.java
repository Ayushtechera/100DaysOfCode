package interfaces.extendDemo2;

public interface A {
    default void fun(){ // Even though there is asbtract method over here and it is not ahowing any error because it is deffault 
        System.out.println("Hi I am in A");
    }
}

package a;

import static b.Message.message;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Hello Sir,");
        message();// It can only be accessed from another package>class>method when that method is public in that class if it not public then can't access it through other class.
        
    }
    
}

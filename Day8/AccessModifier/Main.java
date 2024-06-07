package AccessModifier;

// In this code we are studying about access modifier how PRIVATE, PROTECTED & PUBLIC  works internally how & when we can access them.
// When to use which one:
// Private:- is for sensitive data that we don't want direct access to
// then how we can use it....we can access it via getter and setter method which are public

// No Modifier or Default one:- Use it for those variables which you don't want to use outside the package.

// Protected :- Use it for those variables which you don't want to access outside the package but subclass is in the different package.

// Public :- Use it when you want to access it everywhere

public class Main {
    public static void main(String[] args) {
        Example obj = new Example(06, "Ayush");

        // Need to do a few things
        // 1. Access the data members
        // 2. Modify the data members
        


        // int n = obj.num; //We cannot access the num since it is private
        String name = obj.name; // Now here we can access the name because when we don't provide any ACCESS MODIFICATION to the then by default it can accessed but only from the same package
    }
    
}

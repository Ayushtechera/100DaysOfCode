package AccessModifier;
// import AccessModifier.Example;
public class subclass extends Example {
    int num;
    String name;

    public subclass(int num,String name){
        super(num, name);
    }

    public static void main(String[] args) {
        subclass obj = new subclass(23, "ayush");

        System.out.println( obj instanceof Example); // instanceof method is used to check,object is instance of which class 
    }
    
}

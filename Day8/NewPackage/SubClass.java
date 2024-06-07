package NewPackage;

import AccessModifier.Example;
// For Protect:- only subclass of super class in different in package can access the protected variable
public class SubClass extends Example {

    public SubClass(int num, String name){

        super(num,name);
    }
    public static void main(String[] args) {
        SubClass obj =  new SubClass(25, "ayush");
        String name = obj.name; // We are able to access it 

    }
}



// Or subclass of subclass in different package can access the protected variable
class subsubClass extends SubClass {

    public subsubClass(int num,String name){
        super(num, name);
    }
    public static void main(String[] args) {
        subsubClass obj1 = new subsubClass(66,"ayush");
        String name1 = obj1.name; // we are also able to access it through subclass of subclass of different package.
    }

}


class subclass2 extends Example{

    public subclass2(int num, String name){
        super(num, name);
    }

    public static void main(String[] args) {
        subclass2 A = new subclass2(23, "Ayush");
        String ex = A.name;
    }

}

package abstractDemo;

public abstract class Parent{ // When we put final behind the class it prevents the class from being inheriting So, we cannot have final abstract class.

    // If atleast one of the method is abstract then the class need to be abstract as well. 

    int age; // we can also have variables over here in abstract class
    final int Marks;

    // We can create constructor of an abstract classes
    public Parent(int age) { // We can put this constructor here when we have some final value in tha abstract class
        this.age = age;
        Marks = 2425;
    }

    // We cannot create abstract constructors
    // abstract Parent();

    // We cannot create abstract static methods why because static method don't get overriden then what's the point of creating abstract static method.
    
    // But we can create static methods in abstract classes
    static void greeting(){
        System.out.println("GoodMorning");
    }

    // we can also create normal methods in abstract classes
    void normal(){
        System.out.println("Hi i am in normal method");
    }
      
    
    abstract void CountryChoice();
    abstract void UniversityChoice();


}
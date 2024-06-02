public class First {
    public static void main(String[] args) {

        // Creating new object of class Student
        Student[] students = new Student[5];

        //Accessing 


        Student Ayush = new Student(15, "Ayush kashyap",245.53f);// Since there is 3 values in constructor so, it will call the constructor of 3 values form the class
        // System.out.println(Ayush);//It will give some random value
        // System.out.println(Ayush.rollno);
        // System.out.println(Ayush.name);
        // System.out.println(Ayush.marks);
        // Ayush.greeting();
        // Ayush.changeName("BROCODE"); // By this function we can change the name 
        // Ayush.greeting();

        // Student random = new Student();// Since the constructor is empty so, it will call the empty constructor from the class.
        // System.out.println(random.name);

        Student random = new Student(Ayush);
        System.out.println(random.name);
        System.out.println(random.marks);
        System.out.println(random.rollno);
    }
    
}

// Creating a class
// For every single student
class Student {
    int rollno;
    String name;
    float marks;

    // Constructor is a special function, that runs when you create an object and it allocate some variable.
    // This Student constructor will run when you create new object

    // We need a way to add the values of the above properties object by object

    // We need one word to access every object

    void greeting(){
        // System.out.println("Hello!! my name is "+ name);
        System.out.println("Hello!! my name is "+ this.name); 
    }
    
    void changeName(String newName){
        name = newName;
    }

    // Creating new constructor that actually takes value from another object means:- student takes value form other student

    // CONSTRUCTOR OVERLOADING: Here we are creating the constructor of same names but with different arguments so, it is called the constructor overloading.
    // Constructor Nickname: 
    Student (Student other){
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }

    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13 , "default person", 100.2f)
        this(00,"deffault person", 100.0f);
    }


    // Student arpit = new Student(12,"arpit", 90.35f);
    // here,  this will be replaced with arpit
    Student (int rollno, String name, float marks) { // The refrence variable name used in arguement of constructor and used in class do not have to be same..but to if you want to use same reference variable name then you have to use "this" keyword.
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

// "this" keyword:- this keyword basically means what object you are reffering to.


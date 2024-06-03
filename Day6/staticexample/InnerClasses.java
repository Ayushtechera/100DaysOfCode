package staticexample;

// outer classes cannot be static
public class InnerClasses {
    public static void main(String[] args) {
        Test a = new Test("Ayush");
        Test b = new Test("Raja");

        System.out.println(a);
        
    }


    
    static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
    
        @Override // This is known as Annotations
        public String toString() {
        return name;
        }
    }


    // Since static stuff do not depends on objects and objects are created at run-Time So, objects are created at runtime and static stuff is not link to objects hence, all the static stuff they resolve at compile time.  

}

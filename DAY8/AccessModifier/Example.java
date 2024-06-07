package AccessModifier;

public class Example {
    private int num; // When we Private then the varible can be accessed in this class only.
    // public String name; // When you don;t specify any access modifier than it can access in only that package and not from any other package 
    protected String name; //  when use public that means we can access it everywhere from any package
    int[] arr;

    public int getNUM() {
        return num;
    }

    public void setNUM(int num) {
        this.num = num;
    }

    public Example (int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    
}

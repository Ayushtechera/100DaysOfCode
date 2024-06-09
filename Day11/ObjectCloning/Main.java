package ObjectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        // This way of cloning a objects takes lots of processing time,because we are using another new keyword.
        Human ayush = new Human(19,"Ayush");
        // Human twin = new Human(ayush);

        Human twin = (Human)ayush.clone();
        System.out.println(twin.age + " " + twin.name); // we can clone the object like this with a faster processing time.
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(ayush.arr)); // this is shallow copy note in notebook.
        System.out.println(Arrays.toString(twin.arr));
    }
    
}

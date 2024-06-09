package ObjectCloning;

public class Human implements Cloneable {

    // That's a manual cloning of objects.
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        arr = new int[]{2,4,6,8};
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // return super.clone();

        Human twin = (Human)super.clone();
        // making a deep copy
        twin.arr = new int[twin.arr.length];
        for(int i = 0; i < twin.arr.length; i++){
            this.arr[i] = this.arr[i];
        }
        return twin; 

    
    }
    
}

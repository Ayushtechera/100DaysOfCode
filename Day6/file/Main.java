package file;

public class Main {
    public static void main(String[] args){
        // Human Ayush = new Human("ayush",18,250000, true);
        // Human rahul = new Human("Rahul",20,544585,false);

        // System.out.println(Ayush.population);
        // System.out.println(rahul.population); 
        

        // wish(); // Since, the wish method is non static hence we cannot call it in static method because static method only access the static data,because non static belongs to


    }

    // this is not dependent on objects because it is static
    static void fun(){
        //wish();// You cannot use it because it requires an instance but the function you are using it in does not depend on instances

        // You cannot access non static stuff without referencing their instances in a static context.

        // hence, here i am referencing it
        Main obj = new Main();
        obj.wish();
    }

    // we know that something which is not static,belong to an object.
    void wish(){
    System.out.println("Goodmorning Sir!");
    }

}


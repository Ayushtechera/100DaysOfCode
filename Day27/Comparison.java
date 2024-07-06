public class Comparison {
    public static void main(String[] args) {
        // These string a & b are pointing to the same value in String pool
        String a = "Ayush"; 
        String b = "Ayush";
//1. == comparator:- This will check if the reference variable are pointing to the same object in heap or not if yes then it will return True if not then False example below:

        System.out.println(a==b); // this will return true since they are pointing to the same value

        // Now we are creating different objects of same value by using "new" keyword.
        String name1 = new String("Ayush");
        String name2 = new String("Ayush");

        // now we use the == comparator
        System.out.println(name1==name2); // This time it will return false even the value of both name1 and name2 are same but they are pointing to the different object in heap.

//2. .eaqual() Method:- this will only check the value of the reference variable if the value if same then True else False.

        System.out.println(name1.equals(name2)); // It will return true even they are point to the different objects in heap but the value is same.


        // To print particular value from the string then we can use charAt() method
        System.out.println(name1.charAt(0)); // it will return "A" because it is at 0th index of the string


    }
}

public class NumberRecursion {
    public static void main(String[] args) {
        // Write a function that takes the number and print that number
        // print first five numbers by using only one method. 

        print(1);
    }

    static void print(int n){ 
        // Base condition:
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        // This is recursive call
        // If you are calling the again and again, you can treat it as a separate call in the stack.
        print(n + 1);
    }
}

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);// This will just call the valueof method and in valueof it will call default toString method and print it in the console as a string
        System.out.println("AyushKashyap");// same as above
        System.out.println(new int[]{1,5,93,7}); // This will call the default tostring method and it will print some hascode value and etc etc.
        System.out.println(Arrays.toString(new int[]{1,5,93,7})); // this will not call the default toString but it will call the .toString() method which is in Arrays to print the array in console.


        String name = null;
        System.out.println(name); // It will call the to String method but since the value of objext is null hence, it will return the null.
        //Below code is of valueof method which is called in println method:
        // public static String valueOf(Object obj) {
        //     return (obj == null) ? "null" : obj.toString();
        // }
        //nullPointerException:-
        // when we don't provide (obj == null) this check hence then it will be null.toString(); and null will not contain anything since it is null henceit will through nullpointerexception. 
    }
}
  
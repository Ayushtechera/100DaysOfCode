import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Operator {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // When we add character it will add the ascii value of both the character.
        System.out.println("a"+"b"); // When we add Strings it will concatinate the strings.
        System.out.println('a' + 3); // when we add character and integer it will add integer to the ascii value of the charcter.
        System.out.println((char)('a' + 3));  // now here ('a' + 3) will return ascii value of d and we are casting it to charcetr hence it will return d.


        System.out.println("a" + 1); 
        // when int is concatinated with String then integer(int) will be converted to its wrapper class that is (Integer) and will call its own toString().
        // This is same as after few steps "a" + "1"
        
        System.out.println("Ayush" + new ArrayList<>());
        System.out.println("Ayush" + new Integer(56));


        // System.out.println( new ArrayList<>() + new Integer(56)); // + operator has one requirement that :- We casn use + with primitives and with different complex objects also but codition is atleast one string value should be there.
        // that's why it is showing  an error
        // example with one string
        String num = new ArrayList<>() +" "+new Integer(56);
        System.out.println(num);
    }
}

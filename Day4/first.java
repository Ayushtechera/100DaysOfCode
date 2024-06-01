import java.net.CacheRequest;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();


        
        // switch(fruit) {

        //     case "Mango":
        //         System.out.println("king of fruit");
        //         break;
        //     case "Apple":
        //         System.out.println("Sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("round citric Fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("green small fruit");
        //         break;

        //     default:
        //         System.out.println("PLEASE ENTER A VALID FRUIT");
                // break;


        // Another syntax for Switches
        
        switch (fruit) {
            case "mango" -> System.out.println("King of fruit");
            case "apple" -> System.out.println("sweet red fruit");
            default -> System.out.println("please enter a valid fruit");
    
        }
        System.out.println("Thanks for using this program");

    }

}

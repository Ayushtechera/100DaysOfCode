
import java.util.*;


public class takinginput {
    public static void main(String args []) {
        //taking input
        Scanner sc = new Scanner(System.in);
        // takes only one word as a input by using next()
        String name = sc.next();
        System.out.println(name);
        // can take input more than 1 word by using nextLine()
        String paragraph = sc.nextLine();
        System.out.println(paragraph);
        // to take int as a input we use nextInt()
        int var = sc.nextInt();
        System.out.println(var);
        //nextFloat() is used to take float num as a intput
        Float dec = sc.nextFloat();
        System.out.println(dec);






    }
}

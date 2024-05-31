import java.util.Scanner;

//  Question-2 :- Quesion is to check whether the First letter of the give String is in uppercase or lowercase.
public class que2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }

    }
    
}

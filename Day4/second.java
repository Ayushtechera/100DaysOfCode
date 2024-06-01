import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.nextLine();
        String personalised = mygreet(naam);
        System.out.println(personalised);
    }

    static String mygreet(String name){
        String message = "Hello!!" +   name;
        return message;
    }


}

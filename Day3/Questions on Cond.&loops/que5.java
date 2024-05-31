import java.util.Scanner;

// Question-5 :- Question is to Reverse the given number
public class que5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number:-");
        int n = in.nextInt();
        int s = 0;

        while (n>0) {
            int rem = n%10;

            n /= 10;
 
            s = s * 10 + rem; 
        }

        System.out.println(s);

    }
    
}

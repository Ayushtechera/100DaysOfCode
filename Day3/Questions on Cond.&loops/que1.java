import java.util.Scanner;

// Que 1 : out of three number tell which number is greater?

public class que1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number first number:");
        int a = in.nextInt();
        System.out.print("Enter the number Second number:");
        int b = in.nextInt();
        System.out.print("Enter the number third number:");
        int c = in.nextInt();

        int max = a;
        if(b > max){
             max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);


    }
    
}

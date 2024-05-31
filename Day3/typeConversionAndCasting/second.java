import java.util.Scanner;


// Narrowing or Explicit Conversion:
//Typecasting


public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number");
        int num = (int)(input.nextFloat());//type casting float to int

        // int num = (int)(55.22); //casting float to int
        System.out.println("Casted num is :"+num);
    }
    
}

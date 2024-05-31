

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Automatic type conversion
        System.out.print("Enter the number:");

        // int num = input.nextInt();//It will not take the float input because int is a smaller datatype than float,
        // // but if we give int to float it will take the input because float is bigger datatype than the int. for eg:-  
        // System.out.println("The Entered Number is:"+num);

        float num = input.nextFloat();
        System.out.println("The Entered Number is:"+num);

    }
}

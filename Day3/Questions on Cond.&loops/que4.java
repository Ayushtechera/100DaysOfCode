import java.util.Scanner;


//Checking the occurence of the number 5
public class que4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int count = 0;
        while (n>0) {
            int rem = n%10;
            if (rem == 5) {
                count++;
            }

            n = n/10;
            
        }

        System.out.println(count);
    }

    
}

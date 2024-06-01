package Question;

import java.util.Scanner;

// Question is to check whether the given number is prime or not                            


public class FirstQue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));

    }

    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while (c < n) {
            if(n%c == 0){
                return false;
            }
            c++;
        }

        if (c>=n) {
            return true;
        }
        return false;
        


    }


    
}

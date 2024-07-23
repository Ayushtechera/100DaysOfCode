// Question:- given number n, find the number of set bits or 1's in the binary 
// n = 9 and 9 in binary = 1001 so ans = 2


public class Setbits {
    public static void main(String[] args) {

        int n = 500000;
        System.out.println(Integer.toBinaryString(n));
        int counter = 0;
        while(n > 0){
            // if((n&1)==1){
            //     counter++;
            // }
            // n = n >> 1;

            // Another way to do the question
            counter++;
            n=n&(n-1);

           
        }

        System.out.println(counter);
    }
}

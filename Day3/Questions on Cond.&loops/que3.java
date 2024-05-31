import java.util.Scanner;

// Question-3 :- the question is find nth fibonacci number. Fn=F(n-1)+F(n-2)
 public class que3 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;


        while (count<=n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);

 
    }
}

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
    
        swap(a,b);


        //Swap number code.
        // int temp = a;
        //  a =  b;
        //  b = temp;
        System.out.println(a+ " " + b);//the value is not swaped this is because the reference variable of function is not changing the original object.
        
    }
     
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        
    }

}

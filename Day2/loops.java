import java.util.*;
//For loops
public class loops {
    public static void main(String[] args) {
        // for(int counter = 1;counter < 11;counter = counter + 1){
        //     System.out.println(counter);
        // }
        // print the sum of first n natural number using for loops
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i <= n; i++){
        //     sum =  sum + i;
        // }
        // System.out.println(sum);
        for(int i = 1; i<11;i++){

            System.out.println(n*i);


        }
        
        
    }
    
}
//While Loops
public class loops {
    public static void main(String[] args){
        int i = 0;
        while(i < 11 ){
            System.out.println(i);
            i++;//updation
        }


    }

}
// do while loops
public class loops{
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println(i);
            i++;//updation
        }while(i<11);
        
    }
}
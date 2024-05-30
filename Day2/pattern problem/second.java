/* Question 2
Print the pattern 
*
**
***  
****
This pattern is called half pyramid
*/ 

public class second {
    public static void main(String args[]) {
        int n = 4;

        // outer loop
        for(int i = 1; i<=n; i++){
            //Inner Loop 
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");  
        }
    }
}

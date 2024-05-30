public class numpyramid {
    public static void main(String[] args) {
        int n = 5;
        

        // outer loop
        for(int i =1; i<=n; i++){


            // inner 1st loop for spaces
            int spaces = (n-i);
            for(int j=1; j <=spaces; j++){
                System.out.print(" ");
            }

            //2nd inner loop for printing stars
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
                
            }
            System.out.println();
        }

    }
    
}

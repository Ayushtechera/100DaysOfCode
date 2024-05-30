public class ninth {
    public static void main(String[] args) {
        int n = 4;
        // upper half
        //outer loop
        for(int i = 1; i<=n; i++){
            // for 1st stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // for Spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // for 2nd stars
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i>=1; i--){
            // for 1st stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // for Spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            // for 2nd stars
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern28 {
    public static void main(String[] args) {
        Pattern28(5);
    }

    
    static void Pattern28(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalNumberOfCols = row > n ? 2 * n-row : row;
            int spaceValue = n - totalNumberOfCols; 
            for (int space = 0; space <spaceValue; space++) {
                System.out.print(" ");
            }
            for(int col = 0; col < totalNumberOfCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

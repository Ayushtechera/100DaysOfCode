// question-4 print the below pattern
// 1
// 1 2
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5

public class Pattern4 {
    public static void main(String[] args) {
        Pattern4(5);
    }

    static void Pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

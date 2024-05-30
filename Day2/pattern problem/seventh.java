public class seventh {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;//num++ = num = num + 1
                //after printing the num in inner loop the value of num is increased by 1.
            }
            System.out.println();
        }
    }
}

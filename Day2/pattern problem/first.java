public class first {
    public static void main(String args[]) {
        
        int r = 4;
        int c = 10;

        //OuterLoop
        for(int i=1; i<=r; i++) {
            //Inner Loop
            for(int j=1; j<=c; j++) {
                //cell-> (i,j)
                if(i == 1 || j == 1 || i == r || j == c ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}

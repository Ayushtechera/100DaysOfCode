public class MaxWealth {
    public static void main(String[] args) {
        int [][] arr = {
            {13,467,23},
            {2,46,04},
            {29,8743,83}
        };

        System.out.println(maximumWealth(arr));
    }


    public static int maximumWealth(int[][] accounts){
        int ans = 0;
        for (int[] account2 : accounts) {
            int sum = 0;
            for (int element : account2) {
                sum =  sum + element;
            }

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}

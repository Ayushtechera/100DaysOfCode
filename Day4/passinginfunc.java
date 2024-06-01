import java.util.Arrays;


public class passinginfunc {
    public static void main(String[] args) {
        int[] nums = {3,6,46,46,41};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;//when we change value through arr the value in main object also changes hence,arrays are mutable. 
    }
}

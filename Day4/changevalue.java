import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        //creating an array
        int[] arr = {1,24,245,453,24};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;//Here we are modifying the array,but in previous examples the string is immutable so there we are creating the new string and hence the original object remains unchanged.
    }
    
}

// Here it will work,because the reference variable of the function will change the original object.


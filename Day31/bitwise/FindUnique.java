// Question: In given array, every number appears twice only 1 number appears once find that number
// arr={2,3,,1,2,1,3,6,4}


public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,1,3,6,4};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr){
        int unique = 0;

        for (int n : arr) { //iterating over each number in array:- for every number in array just exor it 
            unique = unique^n; //exoring all element in array to get the single element in the array
        }
         return unique;
    }
}

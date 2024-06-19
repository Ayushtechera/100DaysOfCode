public class smallestLetter {
    
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        char ans = nextGreatestLetter(letters ,target);
        System.out.println(ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        
        // but what if the target is greater than the greatest number in the array then no checkLetter
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];  // When the targeted character is present in the array then it will return the first element of the array.
                                                // And here in this line we'are returning the element at that particular index. 
    }
}

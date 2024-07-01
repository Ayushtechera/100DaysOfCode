

import java.util.Arrays;

public class searchInStrings {
    public static void main(String[] args) {
        String name = "ayush";
        char target = 'u';

        // toCharArray();
        System.out.println(Arrays.toString(name.toCharArray()) );
        
    }
    static boolean search2(String str, char Target){
        if(str.length() == 0){  
            return false;
        }

        for(char ch : str.toCharArray()){  // to use Foreach loop we need some array or collection of data that why we have converted String into an array by using .toCharArray() method.
            if(ch == Target){
                return true;
            }
        }
        return false;

    }
    

    static boolean search(String str, char Target){
        if(str.length() == 0){  // here .lenght() is function and ion array that's a variable.
            return false;
        }

        for(int i=0; i < str.length(); i++){
            char element = str.charAt(i);
            if(element == Target){
                return true;
            }

        }
        return false;

    }
}

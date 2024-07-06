public class Performance {
    public static void main(String[] args) {
        String alpha = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            alpha = alpha + ch;
            
        }

        System.out.println(alpha);
    }

    // But there was a problem in this code: the Problem is of wastage of memory and it has has time complexity of O(N^2) to know more check notes 
    // to resolve this problem we are using the Stringbuilder class.
}

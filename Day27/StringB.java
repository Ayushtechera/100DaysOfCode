// String Builder Class Example

public class StringB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String alpha = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
            
        }

        System.out.println(builder.toString());
    }
}

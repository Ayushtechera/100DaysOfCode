package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        // int c = a/b; // this will throw Arithmatic Exception and to print that exceptionin better way we can use try and catch.
        
        // try and catch

        try{ //try means try everything over here but if anything badly happens here.
            int c = a/b;
        }catch(Exception e){  // if bad happens then catch here in "catch"
            System.out.println(e.getMessage());
        } finally {  // "finally" keyword means no matter what happens if exception is thrown or not thrown it will execute
            System.out.println("this will always get ");
        } 
    }

    
}

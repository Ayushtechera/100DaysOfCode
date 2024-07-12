public class FibonacciByRecursion {
    public static void main(String[] args) {
        // int ans = fibo(4);
        // System.out.println(ans);
        System.out.println(fibo(50));
        
    }

    static int fibo(int n){
        // The base conditon:
        if(n < 2){
            return n;

        }
        // Recursive call
        // this is not the tail recursion because it will first take the fibo(n-1) then it will find out the fibo(n-2) then it will add both the values and return it.
        return fibo(n-1) + fibo(n-2);
    }
}

public class BinarySearchSqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; //Precession value till how many numbers of decimal place do we need the answer

        System.out.printf("%.3f",sqrt(n,p));
    }


    static double sqrt(int n, int p){
        int s = 0;
        int e = n;

        double root = 0.0;
        // Normal binary search for the 1st fix value of the square root
        while(s<=e){
            int mid = s + (e - s)/2;

            if(mid*mid == n ){
                return mid;
            }
            
            if(mid*mid > n ){
                e = mid - 1;
            }else{
                s = mid + 1;
            }

        }

        // Finding the rest decimal places according to the precise decimal places
        double increment = 0.1;
        for(int i = 0; i < p; i++){
            while(root * root <= n){

                root += increment;

            }
                
            root-=increment;
            increment /= 10; // Just incrementing the decimal for precise decimal places
        
        }
        return root;
    }
}

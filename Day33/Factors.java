import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        // factors(20);
        // factorsO(20);
        factorsFinal(20);
    }


    // This is a bruteforce soltion
    //  time complexity = O(n);
    // static void factors(int n){
    //     for(int i = 1; i <= n; i++){
    //         if(n%i ==  0){
    //             System.out.println(i + " ");
    //         }
    //     }
    // }


    // More optimised soltion 
    // Time complexity is :- O(squareroot of n)
    // Space complexity is :- constant
    static void factorsO(int n){
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n%i ==  0){
                if(n/i==i){
                    System.out.print(i);
                }
                System.out.print(i + " " + n/i + " "); // this is not returning the answer in the sorted form 
            }
        }
    }

    // Here in this method it will return the ans in the sorted form
    // but space and time complexity both = O(SquareRoot(N)) because we are storing it in the list 
    static void factorsFinal(int n){
        ArrayList<Integer> list =  new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n%i ==  0){
                if(n/i==i){
                    System.out.print(i);
                }else{
                    System.out.print(i + " " ); // this will return the answer in sorted order
                    list.add(n/i);
                }
            }
        }

        for(int i = list.size() - 1 ; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }

    }


   
 
}

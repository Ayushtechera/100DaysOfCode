package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class introToArrayList{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        
        //Syntax
        
        ArrayList<Integer> list = new ArrayList<>(10);
        //    list.add(234);
        //    list.add(6);
        //    list.add(5775);
        //    list.add(4436);


        //    // Lot of fucntions we can apply on list some of them are:
        //    list.remove(0); // Use to remove particular value from the array list from partiular index.

        //    System.out.println(list.contains(4436));; // Use to check whether the particular item present in the arraylist or not.


        //    System.out.println(list);
        //    list.set(0,1024); // Use to change value at particular index.
        //     System.out.print(list);


        //    System.out.println(list);

        //Input

        // System.out.println("hello");

        System.out.println("Enter the five integer value: ");
        for(int i = 0; i < 5; i++){
            list.add(in.nextInt());
        }

        // for (int i = 0; i < 5; i++){
        //     System.out.println("hello");
        // }


        // System.out.println("hello");
        // // To get output simply do

        // System.out.println(list);

        // // But also you get output by loop also
        // // to get item at any index
        
        System.out.println("Content of the list is: ");
        for (int i  = 0; i < 5; i++){
            System.out.println(list.get(i));// Pass index here in get function. list[index] this syntax will not work here.

        }
        // System.out.println(list);

    }
    
    
    
}

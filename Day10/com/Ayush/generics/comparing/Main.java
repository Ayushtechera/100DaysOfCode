package com.Ayush.generics.comparing;

import java.util.Arrays;

//1
// Topic- Comaparing the objects.

//3
//Acutal class that does this thing is a COMPARABLE INTERFACE we need to implement it
public class Main {
    public static void main(String[] args) {
        Student ayush = new Student(2,85.6f);
        Student Shivam = new Student(45,92.7f);
        Student Rahul = new Student(5,98.7f);
        Student Raj = new Student(53,90.7f);
        Student Yash = new Student(10,58.7f);

        //2
        // if(ayush>Shivam){ // ERROR->Here java got confused and ask dude you have two parameters which one do you want to me to compare Marks or rollno.
        //     System.out.println("Ayush has scored more marks");
        // }

        Student[] list =  {ayush, Shivam,Rahul,Raj ,Yash};

        System.out.println(Arrays.toString(list));


        // We can compare it in sort also by using Comparator
        // Arrays.sort(list , new Comparator<Student>() {

        //     // Now in this method you need to provide the comparable properties.
        //     // We can compare by both the ways:- by compareto method of Comparable Interface also and from inside the sort also using comparator.
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //     //    return (int)(o1.marks - o2.marks); // sorted in ascending order
        //           return -(int)(o1.marks - o2.marks); // sorted in descending order
        //     }

        //Can also write in lambda function.
            Arrays.sort(list , (o1, o2) -> -(int)(o1.marks - o2.marks)); // sorted it based on the marks


        System.out.println(Arrays.toString(list));


        // if(ayush.compareTo(Shivam) < 0 ){
        //     System.out.println("Shivam has scored more marks");

        // }

    }
    
}

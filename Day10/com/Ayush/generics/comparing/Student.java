package com.Ayush.generics.comparing;

public class Student 

{

    int roll;
    float marks;

    public Student(int rollno, float marks){
        this.marks=marks;
        this.roll=rollno;
    }

    // @Override // Compareto method is important because java don't know which parameter to compare of objects that's why it's important.
    // public int compareTo(Student o) {  
    //     int diff = (int)(this.marks - o.marks);

    //     // diff = 0 then, the marks are equal.
    //     // diff < 0 then o has score more marks and else o is smaller.
    //     return diff;
    // }

    @Override
    public String toString() {
        return marks + " ";
    }

    
}

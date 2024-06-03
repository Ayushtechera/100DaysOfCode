package file;

public class Human {
    int age;
    int salary;
    String name;
    boolean married;
    static long population;

    public Human(String name,int age,int salary,boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
        this.salary = salary;
        Human.population += 1;
    }
}

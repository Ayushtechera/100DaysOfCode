package abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age){
        super(age);
    }

    
    @Override
    void normal() {
        super.normal();
    }


    @Override
    void CountryChoice(){
        System.out.println("I want to study in Russia");

    }

    @Override
    void UniversityChoice(){
        System.out.println("I have choosen Lomonosov Moscow State University");
    }
}

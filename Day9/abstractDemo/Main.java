package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son1 = new Son(25);
        son1.CountryChoice();

        Daughter daughter1 = new Daughter(20  );
        daughter1.CountryChoice();

        Parent.greeting();
        daughter1.normal();
        son1.normal();

        // Parent mom = new Parent(24); // we cannot create object of abstract class
    }
}

package enumExample;

public class Basic{ // We can implement any numbr of interface in enum
                    // we cannot inhherit enum, abstract methos is not allowed in enum means we have to provide the body in the method
    enum Week  implements A{
        //these are enum constants
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // Everyonw over here is Static,final and public
        // Since it's final you can't create child enums
        // Type is Week

        Week() {
            System.out.println("Constructor called for " + this);  // this is overriden to print the name of the constants of the enum 
        }

        // This is not public or protected,only private or default 
        // why?
        // we dont want to create new objects and when we make it public or protected then it will allow to initialise new object


        // internally works like this: public static final Week Monday = new Week();
       
        @Override
        public void hello() {
            System.out.println("Hello erick this side");
        }
        
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        week.hello();

        // for(Week day : Week.values()){  // Syntax for iterating on enums constants.
        //     System.out.println(day);
        // }

        
        // System.out.println(week);

        // System.out.println(week.ordinal()); // ordinal tells the position of enum decalaration                        

    }

}
// All the enum implicitly extends java.lang.enum class and enum cannot extend the any other class either.
// enum is not the super class.

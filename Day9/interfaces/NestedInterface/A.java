package interfaces.NestedInterface;

import interfaces.NestedInterface.A.nestedInterface;

public class A {
    // Nested Interface 
    // the nested interface can be decalared as public,private or protected but the top level interface has to be decalared as public or the DEFFAULT ONE.
    public interface nestedInterface{
        boolean isodd(int num);
    }
}

class B implements nestedInterface {

    @Override
    public boolean isodd(int num) {
       return (num & 1) == 1;
    }
}

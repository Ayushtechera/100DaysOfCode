package interfaces;

public interface Engine {

    static final int PRICE = 250000; //--we do not need type static and final over here when initialising the vatiable because it is by deffault static and final
 

    void start();
    void stop();
    void acc();

}

package mx.iteso.boiler;

import mx.iteso.boiler.ChocoBoiler;



public class Boiler1 extends ChocoBoiler{

    private volatile static ChocoBoiler uniqueInstance;

    private Boiler1() {
        boilerName = "Boiler 1";
        empty = true;
        boiled = false;
    }

    public static ChocoBoiler getInstance(){
        if(uniqueInstance== null) {
            synchronized (ChocoBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Boiler1();
                }
            }
        }
        return uniqueInstance;
    }

    public static void clearBoiler(){
            uniqueInstance = null;
        }

}




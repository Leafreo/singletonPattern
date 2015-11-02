package mx.iteso.boiler;


public abstract class ChocoBoiler {

        public boolean empty;
        public boolean boiled;
        public String boilerName;



        public void fill() {
            if (isEmpty()) {
                empty = false;
                boiled = false;
                // fill the boiler with a milk/chocolate mixture
            }
        }
        public void drain() {
            if (!isEmpty() && isBoiled()) {
                // drain the boiled milk and chocolate
                empty = true;
            }
        }
        public void boil() {
            if (!isEmpty() && !isBoiled()) {
                // bring the contents to a boil
                boiled = true;
            }
        }
        public boolean isEmpty() {
            return empty;
        }
        public boolean isBoiled() {
            return boiled;
        }


}

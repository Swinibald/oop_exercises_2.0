package ch.hslu.oop.Week_8;

public final class Temperature implements Comparable<Temperature>{
    private double celsius;
    private double kelvin;
    private double fahrenheit;
    private static final double kelvinOffset = 273.15;
    private static final double gasN = -195.8;
    private static final double soildN = -210.01;
    private static final double gasHg =  356.62;
    private static final double soildHg = -38.83;
    private static final double gasPb = 327.5;
    private static final double soildPb = 1749;

    public Temperature(double celsius){
        this.celsius = 20;
        this.celsius = celsius;
    }

    public double getCelsius(){
        return celsius;
    }

    public double getKelvin(){
        kelvin = celsius + kelvinOffset;
        return kelvin;
    }

    public double getFahrenheit(){
        fahrenheit = celsiusToFahrenheit(this.celsius);
        return fahrenheit;
    }

    public void setCelsius(double newCelsius) {
        this.celsius = newCelsius;
    }

    public void setKelvin(double newKelvin){
        this.celsius = kelvinToCel(newKelvin);
    }
    
    public void setFahrenheit(double newFahrenheit){
        this.celsius = fahrenheitToCel(newFahrenheit);
    }

    public void adjustCelsius(double adjust){
        this.celsius = celsius + adjust;
    }

    public void adjustKelvin(double adjust){
        this.kelvin = getCelsius() + adjust;
        setCelsius(kelvin);
    }

    public void adjustFahrenheit(double adjust){
        this.celsius += adjust * 5.0 / 9.0;
    }

    public String elementState(String element, int temperature){
        switch(element) {
            case "N", "Nitrogen": if (temperature < soildN) {
                return "Nitrogen at " + temperature + " is solid.";
            }else if (temperature > gasN) {
                return "Nitrogen at " + temperature + " is gas.";
            }else{
                return "Nitrogen at" + temperature + "is liquid.";
            }
            case "Hg", "Mercury": if (temperature < soildHg) {
                return "Mercury at " + temperature + " is solid.";
            }else if (temperature > gasHg) {
                return "Mercury at " + temperature + " is gas.";
            }else{
                return "Mercury at" + temperature + "is liquid.";
            }
            case "Pb", "Lead": if (temperature < soildPb) {
                return "Lead at " + temperature + " is solid.";
            }else if (temperature > gasPb) {
                return "Lead at " + temperature + " is gas.";
            }else{
                return "Lead at" + temperature + "is liquid.";
            }
            default: return "Element or Temperatur invalid";
         }
}
    @Override 
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }else if (obj==null) {
            return false;
        }else if (!(obj instanceof Temperature)) {
            return false;
        }else if (0 == Double.compare(this.getCelsius(), ((Temperature)obj).getCelsius())) {
            return true;  
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Double.hashCode(getCelsius());
    }

    @Override
    public int compareTo(Temperature t) {
        if (this.getCelsius() == t.getCelsius()) {
            return 0;
        }else if (this.getCelsius() < t.getCelsius()) {
            return -1;
        }else {
            return 1;
        }
    }

    @Override
    public String toString(){
        return String.format("Current Temperature in: Celsius: %d Kelvin: %d Fahrenheit: %d", getCelsius(), getKelvin(), getFahrenheit());
    }

    public static double fahrenheitToCel(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double kelvinToCel(double kelvin){
        return kelvin - kelvinOffset;
    }

    public static double celsiusToKelvin(double celsius){
        return celsius + kelvinOffset;
    }

    public static double celsiusToFahrenheit(double celsius){
        return celsius * 1.8 + 32;
    }
    
}

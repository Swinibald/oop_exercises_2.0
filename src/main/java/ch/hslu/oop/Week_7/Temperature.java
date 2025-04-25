package ch.hslu.oop.Week_7;


import java.util.Objects;

public class Temperature implements Comparable<Temperature>{
    private double celsius;
    private double kelvin;
    private double fahrenheit;
    private static double gasN = -195.8;
    private static double soildN = -210.01;
    private static double gasHg =  356.62;
    private static double soildHg = -38.83;
    private static double gasPb = 327.5;
    private static double soildPb = 1749;

    public Temperature(int celsius){
        this.celsius = 20;
        this.celsius = celsius;
    }

    public double getCelsius(){
        return celsius;
    }

    public double getKelvin(){
        kelvin = celsius + 273.15;
        return kelvin;
    }

    public double getFahrenheit(){
        fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    public void setCelsius(int newCelsius) {
        this.celsius = newCelsius;
    }

    public void setKelvin(double newKelvin){
        this.celsius = newKelvin - 273.15;
    }
    
    public void setFahrenheit(double newFahrenheit){
        this.celsius = newFahrenheit/1.8 - 32;
    }

    public void adjustCelsius( double adjust){
        this.celsius = celsius + adjust;
    }

    public void adjustKelvin( double adjust){
        this.kelvin = kelvin + adjust;
        setKelvin(kelvin);
    }

    public void adjustFahrenheit( double adjust){
        this.fahrenheit = fahrenheit + adjust;
        setFahrenheit(fahrenheit);
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
        }else if (!(this instanceof Temperature)) {
            return false;
        }else if (this.getCelsius() == ((Temperature)obj).getCelsius()) {
            return true;  
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(getCelsius());
    }

    @Override
    public int compareTo(Temperature t) {
        if (this.getCelsius() == t.getCelsius()) {
            return 0;
        }else if (this.getCelsius() < t.getCelsius()) {
            return -1;
        }else {
            return 0;
        }
    }
}

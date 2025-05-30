package ch.hslu.oop.Week_10.Week_11_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Temperature implements Comparable<Temperature>{
    private double celsius;
    private double kelvin;
    private double fahrenheit;
    private static final double kelvinOffset = 273.15;
    private static Logger log = LoggerFactory.getLogger(Temperature.class);

    private Temperature(double celsius){
        try {
            if (celsius >= -273.15) {
                this.celsius = celsius; 
            }else{
                throw new IllegalArgumentException();
            }
        } catch (Exception IllegalArgumentException) {
            log.error("Invalid Temperatur!");
        }
    }

    public static Temperature createFromCelsius(final double celsius){
        return new Temperature(celsius);
    }

    public static Temperature createFromKelvin(final double kelvin){
        double kelvin2 = kelvinToCel(kelvin);
        return new Temperature(kelvin2);
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
    
    public static void main(String[] args) {
        createFromCelsius(-300.0);
    }
}

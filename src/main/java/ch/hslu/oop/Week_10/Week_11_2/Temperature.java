package ch.hslu.oop.Week_10.Week_11_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Temperature implements Comparable<Temperature> {
    private final double celsius;
    private static final double kelvinOffset = 273.15;
    private static final Logger log = LoggerFactory.getLogger(Temperature.class);

    private Temperature(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Temperatur unter dem absoluten Nullpunkt!");
        }
        this.celsius = celsius;
    }

    public static Temperature createFromCelsius(final double celsius) {
        return new Temperature(celsius);
    }

    public static Temperature createFromKelvin(final double kelvin) {
        return new Temperature(kelvinToCelsius(kelvin));
    }

    public double getCelsius() {
        return celsius;
    }

    public double getKelvin() {
        return celsius + kelvinOffset;
    }

    public double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Temperature)) return false;
        Temperature other = (Temperature) obj;
        return Double.compare(this.celsius, other.celsius) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(celsius);
    }

    @Override
    public int compareTo(Temperature t) {
        return Double.compare(this.celsius, t.celsius);
    }

    @Override
    public String toString() {
        return String.format("Celsius: %.2f, Kelvin: %.2f, Fahrenheit: %.2f", 
                getCelsius(), getKelvin(), getFahrenheit());
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - kelvinOffset;
    }
}

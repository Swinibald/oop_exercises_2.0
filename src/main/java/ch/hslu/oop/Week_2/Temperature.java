package ch.hslu.oop.Week_2;

public class Temperature {
    private double celsius;
    private double kelvin;
    private double Fahrenheit;

    public Temperature(int celsius){
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
        Fahrenheit = celsius * 1.8 + 32;
        return Fahrenheit;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    public void setKelvin(double kelvin){
        this.celsius = kelvin - 273.15;
    }
    
    public void setFahrenheit(double Fahrenheit){
        this.celsius = Fahrenheit/1.8 - 32;
    }
}

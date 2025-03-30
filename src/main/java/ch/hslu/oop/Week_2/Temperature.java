package ch.hslu.oop.Week_2;

public class Temperature {
    private double celsius;
    private double kelvin;
    private double fahrenheit;

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


}

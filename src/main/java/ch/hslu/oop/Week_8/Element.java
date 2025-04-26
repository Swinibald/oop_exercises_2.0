package ch.hslu.oop.Week_8;

import ch.hslu.oop.Week_2.Temperature;

public abstract class Element {
    private double boilPoint;
    private double meltPoint;
    private String element;
    private double currentTemp;
    enum State {
        Solid,
        Liquid,
        Gas
        }

    public Element (double currentTemp){
        this.currentTemp = currentTemp;
    }

    public String getState(){
        if (meltPoint > currentTemp) {
            return (element + " is " + State.Solid +" at " + currentTemp + ".");
            
        } else if (boilPoint < currentTemp) {
            return (element + " is " + State.Gas + " at " + currentTemp + ".");
        }else{
            return (element + " is "+ State.Liquid + " at " + currentTemp + ".");
        }
    }

    public String getState(Temperature temp){
        if (meltPoint > temp.getCelsius()) {
            return (element + " is " + State.Solid +" at " + temp.getCelsius() + ".");
        } else if (boilPoint < currentTemp) {
            return (element + " is " + State.Gas + " at " + temp.getCelsius() + ".");
        }else{
            return (element + " is "+ State.Liquid + " at " + temp.getCelsius() + ".");
        }
    }

    public double getBoilPoint() {
        return boilPoint;
    }

    public void setBoilPoint(double boilPoint) {
        this.boilPoint = boilPoint;
    }

    public double getMeltPoint() {
        return meltPoint;
    }

    public void setMeltPoint(double meltPoint) {
        this.meltPoint = meltPoint;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    @Override
    public String toString() {
        return String.format("%s is %s at %d", element, getState(), currentTemp);
    }

    public String getStateAt(Temperature temp){
        return String.format("%s is %s at %d", element, getState(temp), temp.getCelsius());
    }
}



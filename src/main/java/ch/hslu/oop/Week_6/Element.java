package ch.hslu.oop.Week_6;

public abstract class Element {
    private double boilPoint;
    private double meltPoint;
    private String element;
    private double currentTemp;

    public Element (double currentTemp){
        this.currentTemp = currentTemp;
    }

    public String getState(){
        if (meltPoint > currentTemp) {
            return (element + " is solid at " + currentTemp + ".");
            
        } else if (boilPoint < currentTemp) {
            return (element + " is vapor at " + currentTemp + ".");
        }else{
            return (element + " is liquid at " + currentTemp + ".");
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
        return "Element: " + element + "\n Temperatur: " + currentTemp;
    }
}



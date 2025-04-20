package ch.hslu.oop.Week_6;

public class Quicksilver extends Element{
    private static double boilPoint =  356.62;
    private static double meltPoint = -38.83;
    private String element = "Quicksilver";

    public Quicksilver (double currentTemp) {
        super(currentTemp);
    }

    @Override
    public String toString(){
        return super.toString() + " - Giftig!";
    }

}

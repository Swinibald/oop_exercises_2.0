package ch.hslu.oop.Week_12;

public class MainFile {
    public static void main(String[] args) {
        TemperaturFileReader tempReader = new TemperaturFileReader();
        tempReader.addTempToVerlauf();
        System.out.println("Max Temperatur: " + tempReader.tempV.getMax().toString());
        System.out.println("Min Temperatur: " + tempReader.tempV.getMin().toString());
        System.out.println("Zeitpunkt der Max Temperatur: " + tempReader.tempV.getMin().getLocalDateTime().toString());
        System.out.println("Zeitpunkt der Min Temperatur: " + tempReader.tempV.getMax().getLocalDateTime().toString());
    }
}

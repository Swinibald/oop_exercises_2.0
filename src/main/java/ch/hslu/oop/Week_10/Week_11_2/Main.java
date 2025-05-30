package ch.hslu.oop.Week_10.Week_11_2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) { 
    String input; 
    Scanner scanner = new Scanner(System.in);
    Logger log = LoggerFactory.getLogger(Main.class);
    TemperaturVerlauf tempV = new TemperaturVerlauf();
        while (true){
                System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): "); 
                input = scanner.next();
                if ("exit".equals(String.valueOf(input))) {
                    System.out.println(tempV.toString());
                    System.out.println("Programm beendet."); 
                    break;   
                }
            try{
                Float value = Float.valueOf(input);
                Temperature temp = Temperature.createFromCelsius(value);  
                tempV.add(temp);
                
            }catch (Exception e) {
                log.error("Invalid Temperature");
            }
        }
    }   
}

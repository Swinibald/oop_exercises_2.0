package ch.hslu.oop.Week_9;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) { 
    String input; 
    Scanner scanner = new Scanner(System.in); 
    try {
        do { 
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): "); 
            input = scanner.next(); 
            float value = Float.valueOf(input); 
            System.out.println(value);
            TemperaturVerlauf.add(new Temperature(value));
        } while (!"exit".equals(input)); 
            System.out.println("Programm beendet."); 
    } catch (NumberFormatException e) {
        log.error("Invalid Tempersture!", e);
    }
    }
    
}
  
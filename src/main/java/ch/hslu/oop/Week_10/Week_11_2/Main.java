package ch.hslu.oop.Week_10.Week_11_2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) { 
    String input; 
    Scanner scanner = new Scanner(System.in);
    Logger log = LoggerFactory.getLogger(Main.class);
        while (true){
            try {
                System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): "); 
                input = scanner.next();
                if (!"exit".equals(String.valueOf(input))) {
                    System.out.println("Programm beendet."); 
                    break;   
                }else{
                double value = Float.valueOf(input);
                Temperature.createFromCelsius(value);  
            }}catch (Exception e) {
                log.error("Invalid Temperature");
            }
        }
    }   
}

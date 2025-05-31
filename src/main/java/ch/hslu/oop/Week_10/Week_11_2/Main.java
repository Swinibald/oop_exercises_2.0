package ch.hslu.oop.Week_10.Week_11_2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements TemperaturEventListener {

    private static final Logger log = LoggerFactory.getLogger(Main.class);



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperaturVerlauf tempV = new TemperaturVerlauf();

        // Main als Listener registrieren
        Main mainApp = new Main();
        tempV.addTemperaturEventListener(mainApp);

        while (true) {
            System.out.print("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            String input = scanner.nextLine().trim();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println(tempV);
                System.out.println("Programm beendet.");
                break;
            }

            try {
                float value = Float.parseFloat(input);
                Temperature temp = Temperature.createFromCelsius(value);
                tempV.add(temp);
                tempV.getMax();
                tempV.getMin();
            } catch (Exception e) {
                log.error("Fehlerhafte Eingabe: {}", input, e);
            }
        }

        scanner.close();
    }

    @Override
    public void temperaturChanged(TemperaturEvent event) {
        log.info("Property geändert: {} von {} zu {}", 
        event.getTyp(), event.getAlt(), event.getNeu());
    }
}

package ch.hslu.oop.Week_10.Week_11_2;

import java.util.EventListener;

public interface TemperaturEventListener extends EventListener{

    void temperaturChanged(TemperaturEvent event);

}

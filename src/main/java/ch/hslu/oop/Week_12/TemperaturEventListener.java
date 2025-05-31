package ch.hslu.oop.Week_12;

import java.util.EventListener;

public interface TemperaturEventListener extends EventListener{

    void temperaturChanged(TemperaturEvent event);

}

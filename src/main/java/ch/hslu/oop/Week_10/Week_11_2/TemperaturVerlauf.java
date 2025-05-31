package ch.hslu.oop.Week_10.Week_11_2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import ch.hslu.oop.Week_10.Week_11_2.TemperaturEvent.Typ;

public class TemperaturVerlauf{
    private final ArrayList<Temperature> temperaturen = new ArrayList<>();

    Temperature oldMax;
    Temperature oldMin;
    Temperature newMax;
    Temperature newMin;

    private final List<TemperaturEventListener> listeners = new ArrayList<>();

    public void addTemperaturEventListener(TemperaturEventListener listener) {
        listeners.add(listener);
    }

    public void removeTemperaturEventListener(TemperaturEventListener listener) {
        listeners.remove(listener);
    }

    private void fireTemperaturEvent(TemperaturEvent event) {
        for (TemperaturEventListener listener : listeners) {
            listener.temperaturChanged(event);
        }
    }



    public void add(Temperature temp) {
        temperaturen.add(temp);
    }

    public void clear() {
        temperaturen.clear();
    }

    public int getCount() {
        return temperaturen.size();
    }

    public Temperature getMax() {
    if (temperaturen.isEmpty()) return null;

    Temperature maxTemp = temperaturen.get(0);
    for (Temperature temp : temperaturen) {
        if (temp.compareTo(maxTemp) > 0) {
            maxTemp = temp;
        }
    }

    if (oldMax == null || !oldMax.equals(maxTemp)) {
        TemperaturEvent pcEvent = new TemperaturEvent(this, Typ.MAXIMUM, oldMax, maxTemp);
        fireTemperaturEvent(pcEvent);
        oldMax = maxTemp;
    }

    return maxTemp;
}


    public Temperature getMin() {
    if (temperaturen.isEmpty()) return null;

    Temperature minTemp = temperaturen.get(0);
    for (Temperature temp : temperaturen) {
        if (temp.compareTo(minTemp) < 0) {
            minTemp = temp;
        }
    }

    if (oldMin == null || !oldMin.equals(minTemp)) {
        TemperaturEvent pcEvent = new TemperaturEvent(this, Typ.MINIMUM, oldMin, minTemp);
        fireTemperaturEvent(pcEvent);
        oldMin = minTemp;
    }

    return minTemp;
}

    public double getAverage() {
        if (temperaturen.isEmpty()) return 0.0;
        double sum = 0.0;
        for (Temperature temp : temperaturen) {
            sum += temp.getCelsius();
        }
        return sum / getCount();
    }

    @Override
    public String toString() {
        if (temperaturen.isEmpty()) {
            return "Temperaturliste ist leer!";
        }
        return String.format(
            "Anzahl Temperaturen: %d\nHöchsttemperatur: %s\nTiefsttemperatur: %s\nDurchschnittstemperatur: %.2f °C",
            getCount(),
            getMax(),
            getMin(),
            getAverage()
        );
    }
}

package ch.hslu.oop.Week_10;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Motor implements Switchable {

    private static boolean isRunning = false;
    private int rpm = 0;
    private static Logger log = LoggerFactory.getLogger(Motor.class);

    // Datenstruktur zur Speicherung aller Listener.
    private final List<PropertyChangeListener> changeListeners = new ArrayList<>();

    /**
    * Registriert einen PropertyChangeListener.
    * @param listener PropertyChangeListener.
    */
    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.add(listener);
    }

    /**
    * Deregistriert einen PropertyChangeListener.
    * @param listener PropertyChangeListener.
    */
    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.remove(listener);
    }

    @Override
    public void switchOn() {
        if (isRunning){
            log.info("Engine already on."); 
        }else{
            isRunning = true;
            rpm = 600;
            log.info("Engine turned on.");
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorState.Off, MotorState.On);
            this.firePropertyChangeEvent(pcEvent);
        }
    }

        /**
    * Informiert alle PropertyChangeListeners über PropertyChangeEvent.
    * @param pcEvent PropertyChangeEvent.
    */
    private void firePropertyChangeEvent(final PropertyChangeEvent pcEvent) {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(pcEvent);
        }
    }   

    @Override
    public void switchOff() {
        if (isRunning = false){
            log.info("Engine already off.");
        }else{
            isRunning = false;
            rpm = 0;
            log.info("Engine turned off.");
            final PropertyChangeEvent pcEvent = new PropertyChangeEvent(this, "state", MotorState.On, MotorState.Off);
            this.firePropertyChangeEvent(pcEvent);
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return isRunning;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isRunning;
    }

}

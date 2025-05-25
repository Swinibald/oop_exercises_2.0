package ch.hslu.oop.Week_10;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.awt.Taskbar.State;
import java.beans.PropertyChangeEvent;

public class Vehicle implements Switchable, PropertyChangeListener{

    boolean isRunningVehicle = false;
    private static Logger log = LoggerFactory.getLogger(Vehicle.class);
    private Motor motor;
   
    public Vehicle (){
        this.motor = new Motor();
        this.motor.addPropertyChangeListener((java.beans.PropertyChangeListener) this);
    }

    @Override
    public void switchOn() {
        if (isRunningVehicle = true){
            log.info("Vehicle already on.");
        }else{
            isRunningVehicle = true;
            motor1.switchOn();
            log.info("Vehicle turned on.");
        }
    }

    @Override
    public void switchOff() {
        if (isRunningVehicle = false){
            log.info("Vehicle already off.");
        }else{
            isRunningVehicle = false;
            motor1.switchOff();
            log.info("Vehicle turned off.");
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return isRunningVehicle;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isRunningVehicle;
    }

    public void handleMotorEvent(String source, PropertyChangeEvent event){
        if (event.getNewValue() == MotorState.Off && isSwitchedOn() == true) {
            log.info("Warning Motor off while Vehicle still running!");
        }else if (event.getNewValue() == MotorState.On && event.getOldValue() == MotorState.Off && isSwitchedOff() == true) {
            log.info("Motor on while vehicle Off!");
        }
    }

    @Override
    public void PropertyChangeEvent(final PropertyChangeEvent event) {
        if (event.getSource()== this.motor){
            this.handleMotorEvent("Motor", event);
        }         
    }

}

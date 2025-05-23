package ch.hslu.oop.Week_10;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Vehicle implements Switchable{

    boolean isRunningVehicle = false;
    Motor motor1 = new Motor(); 
    private static Logger log = LoggerFactory.getLogger(Vehicle.class);
    public Vehicle (){
    
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

}

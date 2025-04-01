package ch.hslu.oop.Week_4;
import ch.hslu.oop.Week_4.Motor;

public class Vehicle implements Switchable{

    private boolean isRunningVehicle = false;

    public Vehicle (){
    Motor motor = new Motor();  
    }

    @Override
    public void switchOn() {
        if (isRunningVehicle = true){
            System.out.println("Vehicle already on.");
        }else{
            isRunningVehicle = true;
            Motor.switchOn();
            System.out.println("Vehicle turned on.");
        }
    }

    @Override
    public void switchOff() {
        if (isRunningVehicle = false){
            System.out.println("Vehicle already off.");
        }else{
            isRunningVehicle = false;
            Motor.switchOff();
            System.out.println("Vehicle turned off.");
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

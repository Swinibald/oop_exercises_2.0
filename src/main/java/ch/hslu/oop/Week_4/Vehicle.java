package ch.hslu.oop.Week_4;
import ch.hslu.oop.Week_4.Motor;

public class Vehicle implements Switchable{

    private boolean isRunningVehicle = false;
    Motor motor1 = new Motor(); 
    public Vehicle (){
        
    }

    @Override
    public void switchOn() {
        if (isRunningVehicle = true){
            System.out.println("Vehicle already on.");
        }else{
            isRunningVehicle = true;
            motor1.switchOn();
            System.out.println("Vehicle turned on.");
        }
    }

    @Override
    public void switchOff() {
        if (isRunningVehicle = false){
            System.out.println("Vehicle already off.");
        }else{
            isRunningVehicle = false;
            motor1.switchOff();
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

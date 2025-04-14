package ch.hslu.oop.Week_4;

public class Lights implements Switchable {
    private boolean isRunning;
    
    public Lights (){

    }

    @Override
    public void switchOn() {
        if (isRunning == true) {
            System.out.println("Lights slready on!");
        }else{
            isRunning = true;
        }
       
    }

    @Override
    public void switchOff() {
        if (isRunning == false) {
            System.out.println("Lights already off!");
        }else{
            isRunning = false;
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

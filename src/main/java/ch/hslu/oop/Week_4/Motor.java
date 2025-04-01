package ch.hslu.oop.Week_4;

public class Motor implements Switchable {

    private boolean isRunning = false;
    private int rpm = 0;

    @Override
    public void switchOn() {
        if (isRunning = true){
            System.out.println("Engine already on.");
        }else{
            isRunning = true;
            rpm = 600;
            System.out.println("Engine turned on.");
        }
    }

    @Override
    public void switchOff() {
        if (isRunning = false){
            System.out.println("Engine already off.");
        }else{
            isRunning = false;
            rpm = 0;
            System.out.println("Engine turned off.");
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

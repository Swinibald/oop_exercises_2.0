package ch.hslu.oop.Week_5;

public class CountingSwitchable implements Switchable{

    private int switches;
    private boolean isRunning;

    @Override
    public void switchOn() {
        
        if (isRunning == true){
            System.out.println("Engine already on.");
        }else{
            switches++;
            isRunning = true;
            System.out.println("Engine turned on.");
        }
    }

    @Override
    public void switchOff() {
        if (isRunning == false){
            System.out.println("Engine already off.");
        }else{
            switches++;
            isRunning = false;
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

    public int countingSwitchable() {
        return switches;
    }

    

}

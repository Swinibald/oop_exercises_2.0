package ch.hslu.oop.Week_8;

import java.util.ArrayList;

public class TemperaturVerlauf {

    ArrayList<Temperature> temperaturen = new ArrayList<>();
    
    public TemperaturVerlauf(){

    }

    public void add(Temperature temp){
        temperaturen.add(temp);
    }

    public void clear(){
        temperaturen.clear();
    }

    public int getCount(){
        return temperaturen.size();
    }

    public Temperature getMax(){
        int i = 0;
        Temperature maxTemp = temperaturen.get(0);
        while (i < getCount()) {
            if (-1 == maxTemp.compareTo(temperaturen.get(i+1))) {
                maxTemp = temperaturen.get(i+1);
                i++;
            }else{
                i++;
            }
        }
        return maxTemp;
    }

    public double getAverage(){
        double sum = 0.0;
        for (Temperature temp : temperaturen) {
            sum =+ temp.getCelsius();
        }
        return sum/getCount();
    }
}

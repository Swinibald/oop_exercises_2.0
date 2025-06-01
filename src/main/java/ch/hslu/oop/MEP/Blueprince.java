package ch.hslu.oop.MEP;

import java.util.ArrayList;
import java.util.Comparator;

public class Blueprince<T> implements Comparable<Blueprince<T>>, Comparator<Blueprince<T>>{

    private int index = 0;

    private String string = "String"; //String of characters
    private int number = 01234; //Full number.
    private float numberF = 1.234f; //Decimal number 
    private double numberD = 1.234; //Decimal number but with bigger storagespace
    private char character = '@'; //Single Character

    public ArrayList<Object> objectsList = new ArrayList<>();

    public enum exampleEnum{
        partOfEnum1 ("FirstPart"),
        partOfEnum2 ("FirstPart"),
        partOfEnum3 ("FirstPart");

        private String description;

        private exampleEnum(String description){
            this.description = description;
        }
    }

    public boolean controlStructures(){
        // Example of switching on an Enum value
        exampleEnum myEnum = exampleEnum.partOfEnum1; // or any value you want to test
        switch (myEnum) {
            case partOfEnum1:
                // handle partOfEnum1
                break;
            case partOfEnum2:
                // handle partOfEnum2
                break;
            case partOfEnum3:
                // handle partOfEnum3
                break;
            default:
                break;
        }

        if(true){
            return true;
        }else if (false) {
            return false;
        }else{
            return false;
        }
    }
        

    public void loops() {
        boolean expression = true; 
        
        while (expression) {//iterates until the expression is false
            }

        do{ //iterates until the expression is false but iterace once even if the expression is false    
        }while(expression);
        
        for (int i = 0; i < 10; i++) { //iterates ten times 
            }

        for (Object object : objectsList) { //for each instance of an Object in List objectList do smth
            System.out.println(object); //Prints out each object in ObjectsList on a new Line
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Blueprince<T> other = (Blueprince<T>) obj;
        return index == other.index;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(index);
    }


    @Override
    public int compareTo(Blueprince<T> blue) {
        if (this.equals(blue)) {
            return 0;
        } else if (this.index < blue.index) {
            return -1;
        } else {
            return 1;
        }
    }


    @Override
    public int compare(Blueprince<T> o1, Blueprince<T> o2) {
        if (o1.index == o2.index){
            return 0;
        }else if (o1.index < o2.index) {
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public String toString(){
        return "Blueprince " + index;
    }
}

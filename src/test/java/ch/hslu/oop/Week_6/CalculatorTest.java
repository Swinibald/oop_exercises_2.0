package ch.hslu.oop.Week_6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private static Calculator calc;

    @BeforeAll
    public static void setUp() {
        calc = new Calculator();
    }

    @Test
    public void correctAdditon(){
        assertEquals(5, calc.additon(2, 3));
    }

    @Test 
    public void maxAddition(){
        assertEquals(2147483647, calc.additon(2147483646, 1));
    }

    @Test 
    public void minAddition(){
        assertEquals(-2147483648, calc.additon(-2147483647, -1));
    }

    @Test 
    public void overMaxAddition(){
        assertEquals(-2147483648, calc.additon(2147483647, 1));
    }

    @Test 
    public void underMinAddition(){
        assertEquals(2147483647, calc.additon(-2147483648, -1));
    }

    



    


}


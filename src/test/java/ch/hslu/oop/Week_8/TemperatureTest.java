package ch.hslu.oop.Week_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class TemperatureTest {
    @Test
    void testAdjustCelsius() {
        Temperature temp1 = new Temperature(20);
        temp1.adjustCelsius(10);
        assertEquals(30, temp1.getCelsius());
    }

    @Test
    void testAdjustFahrenheit() {
        Temperature temp1 = new Temperature(20);
        temp1.adjustFahrenheit(18);
        assertEquals(30, temp1.getCelsius());
    }

    @Test
    void testAdjustKelvin() {
        Temperature temp1 = new Temperature(20);
        temp1.adjustKelvin(10);
        assertEquals(30, temp1.getCelsius());
    }

    @Test
    void testCompareTo() {
        Temperature temp1 = new Temperature(20);
        Temperature temp2 = new Temperature(30);
        assertEquals(-1, temp1.compareTo(temp2));
        Temperature temp3 = new Temperature(50);
        Temperature temp4 = new Temperature(30);
        assertEquals(1, temp3.compareTo(temp4));
        Temperature temp5 = new Temperature(30);
        Temperature temp6 = new Temperature(30);
        assertEquals(0, temp5.compareTo(temp6));
    }

    @Test
    void testEquals() {
         EqualsVerifier.forClass(Temperature.class).suppress(Warning.STRICT_INHERITANCE, Warning.ALL_FIELDS_SHOULD_BE_USED, Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    void testGetCelsius() {
        Temperature temp1 = new Temperature(20);
        assertEquals(20, temp1.getCelsius());
    }

    @Test
    void testGetFahrenheit() {
        Temperature temp1 = new Temperature(20);
        assertEquals(68, temp1.getFahrenheit());

    }

    @Test
    void testGetKelvin() {
        Temperature temp1 = new Temperature(20);
        assertEquals(293.15, temp1.getKelvin());
        
    }

    @Test
    void testHashCode() {
        Temperature temp1 = new Temperature(20);
        Temperature temp2 = new Temperature(20);
        assertEquals(temp1.hashCode(), temp2.hashCode());
    }

    @Test
    void testSetCelsius() {
        Temperature temp1 = new Temperature(20);
        temp1.setCelsius(30);
        assertEquals(30, temp1.getCelsius());
    }

    @Test
    void testSetFahrenheit() {
        Temperature temp1 = new Temperature(20);
        temp1.setFahrenheit(30);
        assertEquals(30, temp1.getFahrenheit());
    }

    @Test
    void testSetKelvin() {
        Temperature temp1 = new Temperature(20);
        temp1.setKelvin(30);
        assertEquals(30, temp1.getKelvin());
    }
}

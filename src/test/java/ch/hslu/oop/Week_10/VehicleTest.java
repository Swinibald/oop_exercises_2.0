package ch.hslu.oop.Week_10;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    private Vehicle car;

    @BeforeEach
    void createCar() {
        car = new Vehicle();  // initialize the shared test instance
    }

    @Test
    void testIsSwitchedOff() {
        assertTrue(car.isSwitchedOff());
    }

    @Test
    void testIsSwitchedOn() {
        car.switchOn();
        assertTrue(car.isSwitchedOn());
    }

    @Test
    void testSwitchOff() {
        car.switchOn();
        car.switchOff();
        assertFalse(car.isRunningVehicle);
    }

    @Test
    void testSwitchOn() {
        car.switchOn();
        assertTrue(car.isRunningVehicle);
    }
}

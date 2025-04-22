package ch.hslu.oop.Week_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountingSwitchableTest {
    @Test
    void testCountingSwitchable() {
        CountingSwitchable motor = new CountingSwitchable();
        motor.switchOn();
        motor.switchOff();
        motor.switchOff();
        motor.switchOn();
        motor.switchOff();
        assertEquals(4, motor.countingSwitchable());

    }
}

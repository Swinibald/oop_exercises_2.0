package ch.hslu.oop.MEP;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ch.hslu.oop.MEP.Raum.Status;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class RaumTest {

    @Test
    public void testRaumKonstruktorKapazität(){
        Raum raum = new Raum(100, 20);
        assertEquals(20, raum.getKapazität());
    }

    @Test
    public void testRaumKonstruktorRaumnummer(){
        Raum raum = new Raum(100, 20);
        assertEquals(100, raum.getRaumnummer());
    }

    @Test
        void testExceptionDemoAssertJUnit5() {
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
           Raum raum = new Raum(1000, 20);
        });
        assertEquals("Raum Kapazitat zu klein oder Raumnummer ungultig", e.getMessage());
}

    @Test
        void testExceptionKapazitätMin() {
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
           Raum raum = new Raum(100, 9);
        });
        assertEquals("Raum Kapazitat zu klein oder Raumnummer ungultig", e.getMessage());
}

    @Test
        void testExceptionRaumnummerMin() {
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
           Raum raum = new Raum(99, 10);
        });
        assertEquals("Raum Kapazitat zu klein oder Raumnummer ungultig", e.getMessage());
}

    @Test 
        void equalsTest(){
            ;
            Raum raum2 = new Raum(100, 10);
            EqualsVerifier.forClass(Raum.class).suppress(Warning.STRICT_INHERITANCE, Warning.ALL_FIELDS_SHOULD_BE_USED, Warning.NONFINAL_FIELDS).verify();
        }
    
    @Test 
    void testStatusFrei(){
        Raum raum = new Raum(150, 10);
        assertTrue(raum.isFree());
    }

        @Test 
    void testStatusBlocked(){
        Raum raum = new Raum(150, 10);
        raum.setRaumStatus(Status.gesperrt);
        assertFalse(raum.isFree());
    }

}
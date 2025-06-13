package ch.hslu.oop.MEP;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RaumVerwaltungTest {
    @Test
    void testGetRaumError() {
        final Exception e = assertThrows(IllegalArgumentException.class, () -> {
        RaumVerwaltung raum = new RaumVerwaltung();
        raum.getRaum(1);
        });
        assertEquals("Dieser Raum existiert nicht!", e.getMessage());

    }

    @Test
    void testGetRaum() {
        RaumVerwaltung raum = new RaumVerwaltung();
        assertEquals(603, raum.getRaum(603).getRaumnummer());
    }
}

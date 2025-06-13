package ch.hslu.oop.MEP;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RaumTest {

    @Test
    private void testRaumKonstruktorKapazität(){
        Raum raum = new Raum(10, 5);
        assertEquals(raum.getKapazität(), 5);
    }

    @Test
    private void testRaumKonstruktorRaumnummer(){
        Raum raum = new Raum(10, 5);
        assertEquals(raum.getRaumnummer(), 10);
    }

}

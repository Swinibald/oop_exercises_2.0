package ch.hslu.oop.Week_5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SquareTest {
  
    @Test
    void testGetArea() {
        Square square = new Square(0, 0, 5,5); 
        assertEquals(25, square.getArea());
    }

    void testWrongArea(){
        Square square = new Square(0, 0, 5,5); 
        assertNotEquals(10, square.getArea());
    }

    @Test
    void testGetPerimeter() {
        Square square = new Square(0, 0, 5,5); 
        assertEquals(20, square.getPerimeter());
    }
    void testGetWrongPerimeter() {
        Square square = new Square(0, 0, 5,5); 
        assertNotEquals(10, square.getPerimeter());
    }

    
}
}

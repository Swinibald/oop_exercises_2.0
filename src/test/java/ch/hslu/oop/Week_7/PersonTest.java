package ch.hslu.oop.Week_7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.Warning;

import nl.jqno.equalsverifier.EqualsVerifier;

public class PersonTest {

    @Test 
    void testConstructor(){
        Person person = new Person(0, "Sven", "Swini");
        assertEquals("Swini", person.nickname);
        assertEquals("Sven", person.name);
        assertEquals(0, person.id);
    }

    @Test
    void equalsTest(){
        EqualsVerifier.forClass(Person.class).suppress(Warning.STRICT_INHERITANCE, Warning.ALL_FIELDS_SHOULD_BE_USED).verify();
    }

    @Test
    void equalsTrue(){
        Person person1 = new Person(0, "Sven", "Swini");
        Person person2 = person1;
        assertEquals(person1, person2);
    }
    @Test
    void equalsFalse(){
        Person person1 = new Person(0, "Sven", "Swini");
        Person person2 = new Person(1, "Sven", "Swini");
        assertFalse(person1.equals(person2));
    }

    @Test
    void testhashcodeTrue(){
        Person person1 = new Person(1, "Swini", "Sven");
        Person person2 = new Person(1, "Sven", "Swini");
        assertTrue(person1.hashCode() == person2.hashCode());
    }

    @Test
    void testhashcodeFalse(){
        Person person1 = new Person(0, "Sven", "Swini");
        Person person2 = new Person(1, "Sven", "Swini");
        assertFalse(person1.hashCode() == person2.hashCode());
    }
    @Test
    void testCompare() {
        Person person1 = new Person(0, "Sven", "Swini");
        Person person2 = new Person(0, "Sven", "Swini");
        assertEquals(-1, person1.compare(person1, person2));
    }

    @Test
    void testGetName() {

    }

    @Test
    void testGetNickname() {

    }

    @Test
    void testSetName() {

    }

    @Test
    void testSetNickname() {

    }
}

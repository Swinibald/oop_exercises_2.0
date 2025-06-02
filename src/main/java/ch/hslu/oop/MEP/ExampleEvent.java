package ch.hslu.oop.MEP;

import java.util.EventObject;
import java.util.Objects; // Für Objects.requireNonNull in einem robusteren Szenario

/**
 * Eine generische Event-Klasse, die Detailinformationen über eine Zustandsänderung kapselt.
 * Erweitert EventObject und beinhaltet alte und neue Werte sowie den Namen des Events.
 *
 * @param <T> Der Typ der alten und neuen Werte.
 */
public class ExampleEvent<T> extends EventObject {

    private final T oldValue;
    private final T newValue;
    private final String nameOfEvent;

    /**
     * Erstellt eine neue ExampleEvent-Instanz.
     *
     * @param source Das Objekt, das das Event ausgelöst hat.
     * (Sollte niemals null sein, wird vom EventObject-Konstruktor überprüft)
     * @param nameOfEvent Der Name oder Typ des ausgelösten Events (z.B. "TemperaturAenderung").
     * @param oldValue Der Wert der Eigenschaft vor der Änderung.
     * @param newValue Der Wert der Eigenschaft nach der Änderung.
     */
    public ExampleEvent(Object source, String nameOfEvent, T oldValue, T newValue) {
        super(source); // Ruft den Konstruktor von EventObject auf, der 'source' prüft.
        // Objects.requireNonNull(nameOfEvent, "Name des Events darf nicht null sein."); // Optional: zusätzliche Prüfung
        this.nameOfEvent = nameOfEvent;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    /**
     * Gibt den Namen oder Typ des Events zurück.
     *
     * @return Der Name des Events.
     */
    public String getNameOfEvent() {
        return nameOfEvent;
    }

    /**
     * Gibt den Wert der Eigenschaft vor der Änderung zurück.
     *
     * @return Der alte Wert.
     */
    public T getOldValue() {
        return oldValue;
    }

    /**
     * Gibt den Wert der Eigenschaft nach der Änderung zurück.
     *
     * @return Der neue Wert.
     */
    public T getNewValue() {
        return newValue;
    }

    /**
     * Überschreibt die toString-Methode, um eine lesbare Darstellung des Events zu liefern.
     * Nützlich für das Debugging und die Protokollierung.
     *
     * @return Eine String-Repräsentation des Events.
     */
    @Override
    public String toString() {
        return "ExampleEvent{" +
               "source=" + getSource() + // Source wird von EventObject geerbt
               ", nameOfEvent='" + nameOfEvent + '\'' +
               ", oldValue=" + oldValue +
               ", newValue=" + newValue +
               '}';
    }
    
}
package ch.hslu.oop.MEP;

import java.util.EventListener;

/**
 * Ein generisches Event-Listener-Interface.
 * Sollte für spezifische Event-Typen angepasst werden.
 */
public interface ExampleEventListener extends EventListener {
    /**
     * Methode, die aufgerufen wird, wenn ein ExampleEvent auftritt.
     * @param event Das ausgelöste ExampleEvent.
     */
    void exampleChanged(ExampleEvent event);
}

// Beispiel für eine Event-Klasse (muss noch erstellt werden, falls nicht vorhanden)
// Dies ist eine Platzhalter-Definition, die du nach Bedarf anpassen müsstest.
/*
package ch.hslu.oop.MEP;

import java.util.EventObject;

public class ExampleEvent extends EventObject {
    private String eventMessage;

    public ExampleEvent(Object source, String eventMessage) {
        super(source);
        this.eventMessage = eventMessage;
    }

    public String getEventMessage() {
        return eventMessage;
    }
}
*/
package ch.hslu.oop.MEP;

import java.util.EventListener;

public interface RaumEventListener {
    /**
     * Methode, die aufgerufen wird, wenn ein RaumEvent auftritt.
     * @param event Das ausgelöste RaumEvent.
     */
    void RaumEventChanged(RaumEvent event);
}

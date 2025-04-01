package ch.hslu.oop.Week_4;

/**
* Abstrakte Klasse für einen Schalter.
*/
public interface Switchable {

    /**
    * Methode um etwas einzuschalte.
    */
     public abstract void switchOn();

    /**
    * Methode um etwas auszuschalte.
    */
     public abstract void switchOff();

    /**
    * Methode um zu prüfen ob etwas eingeschaltet ist.
    * @return True falls eingeschalten sonst False
    */
     public abstract boolean isSwitchedOn();

    /**
    * Methode um zu prüfen ob etwas ausgeschaltet ist.
    * @return True falls ausgeschalten sonst False
    */
     public abstract boolean isSwitchedOff();

}

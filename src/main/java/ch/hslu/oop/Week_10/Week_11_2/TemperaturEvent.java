package ch.hslu.oop.Week_10.Week_11_2;

import java.util.EventObject;

public class TemperaturEvent extends EventObject {
    public enum Typ { MINIMUM, MAXIMUM }

    private final Typ typ;
    private final Temperature alt;
    private final Temperature neu;

    public TemperaturEvent(Object source, Typ typ, Temperature alt, Temperature neu) {
        super(source);
        this.typ = typ;
        this.alt = alt;
        this.neu = neu;
    }

    public Typ getTyp() { return typ; }
    public Temperature getAlt() { return alt; }
    public Temperature getNeu() { return neu; }
}

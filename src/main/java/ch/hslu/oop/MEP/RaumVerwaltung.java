package ch.hslu.oop.MEP;

import java.util.ArrayList;
import java.util.List;

import ch.hslu.oop.MEP.Raum.Status;
import ch.hslu.oop.Week_10.Week_11_2.TemperaturEvent.Typ;

public class RaumVerwaltung {

    Raum[] raumListe = new Raum[1001];

    public RaumVerwaltung (){
        Raum raum1 = new Raum(600, 18);
        Raum raum2 = new Raum(602, 6);
        Raum raum3 = new Raum(603, 12);
        Raum raum4 = new Raum(605, 24);
        Raum raum5 = new Raum(610, 12);
        addRaumList(raum1);
        addRaumList(raum2);
        addRaumList(raum3);
        addRaumList(raum4);
        addRaumList(raum5);
    }

    private final List<RaumEventListener> listeners = new ArrayList<>();

    public void addRaumEventListener(RaumEventListener listener) {
        listeners.add(listener);
    }

    public void removeRaumEventListener(RaumEventListener listener) {
        listeners.remove(listener);
    }

    private void fireRaumEvent(RaumEvent event) {
        for (RaumEventListener listener : listeners) {
            listener.RaumEventChanged(event);
        }
    }


    public void addRaumList(Raum raum){
        raumListe[raum.getRaumnummer()] = raum;
    }

    public Raum getRaum(int raumnummer){
        if (raumListe[raumnummer] == null) {
            throw new IllegalArgumentException("Dieser Raum existiert nicht!");
        }else {
            return raumListe[raumnummer];
        }
    }

    public void addCustomRaum(int kapazität){
        Raum minKap = raumListe[600];
        for (Raum raum : raumListe) {
            if (raum != null){
                if (raum.getKapazität() >= kapazität && raum.getKapazität() < minKap.getKapazität()) {
                minKap = raum;
                }
            }
        }
        minKap.setRaumStatus(Status.belegt);
        System.out.println("Raum " + minKap.getRaumnummer() + " wurde belegt!");
        RaumEvent raumEvent = new RaumEvent(minKap, minKap.getKapazität());
        fireRaumEvent(raumEvent);
        }

    public boolean raumFreigeben(Raum raum){
        if(raumListe[raum.getRaumnummer()] != null) {
            raum.setRaumStatus(Status.frei);
            raumListe[raum.getRaumnummer()] = null;
            RaumEvent raumEvent = new RaumEvent(raumListe[raum.getRaumnummer()], raumListe[raum.getRaumnummer()].getKapazität());
            fireRaumEvent(raumEvent);
            return true;
        }else{
            return false;
        }
    } 
    
    public boolean raumFreigeben(int raumnummer){
        if(raumListe[raumnummer] != null) {
            raumListe[raumnummer].setRaumStatus(Status.frei);
            raumListe[raumnummer] = null;
            RaumEvent raumEvent = new RaumEvent(raumListe[raumnummer], raumListe[raumnummer].getKapazität());
            fireRaumEvent(raumEvent);
            return true;

        }else{
            return false;
        }
    }  
}

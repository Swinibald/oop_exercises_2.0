package ch.hslu.oop.MEP;

public class Demo implements RaumEventListener{

   
    
    public static void main(String[] args) { 
        RaumVerwaltung raumV = new RaumVerwaltung();
        Demo demo = new Demo();
        raumV.addRaumEventListener(demo);
        raumV.addCustomRaum(6);
        raumV.addCustomRaum(11);
        raumV.addCustomRaum(17);
        for (Raum raum : raumV.raumListe) {
            if (raum != null) {
                System.out.println(raum.getRaumnummer());
            }
           
        }
        
    }

    @Override
    public void RaumEventChanged(RaumEvent event) {
        System.out.println(event.toString());
    }
}

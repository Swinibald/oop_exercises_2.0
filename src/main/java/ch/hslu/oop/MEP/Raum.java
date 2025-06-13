package ch.hslu.oop.MEP;

import java.util.Objects;

public class Raum {
    private final int raumnummer;
    private final int kapazität;

    public Raum (int raumnummer, int kapazität){
        if (raumnummer < 1000 && raumnummer > 0 && kapazität > 9) {
            this.kapazität = kapazität;
            this.raumnummer = raumnummer;
        }else{
            throw new IllegalArgumentException("Raum Kapazitat zu klein oder Raumnummer ungultig");
        }
            
    }

    public int getRaumnummer() {
        return raumnummer;
    }

    public int getKapazität() {
        return kapazität;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + raumnummer;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Referenzidentität
        if (obj == null || getClass() != obj.getClass()) return false; // Null-Check und Typ-Check
        Raum other = (Raum) obj; // Cast
        return raumnummer == other.raumnummer; // Vergleich der relevanten Felder
    }

  

}

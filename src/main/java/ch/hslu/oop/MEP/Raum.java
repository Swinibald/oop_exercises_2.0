package ch.hslu.oop.MEP;

public class Raum {
    private final int raumnummer;
    private final int kapazität;
    private Status raumStatus;



    public Raum (int raumnummer, int kapazität){
        if (raumnummer < 1000 && raumnummer >= 100 && kapazität > 2) {
            this.kapazität = kapazität;
            this.raumnummer = raumnummer;
            this.raumStatus = Status.frei;
        }else{
            throw new IllegalArgumentException("Raum Kapazitat zu klein oder Raumnummer ungultig");
        }   
    }

    public enum Status {
        frei,
        belegt,
        gesperrt;
    }
    public int getRaumnummer() {
        return raumnummer;
    }

    public int getKapazität() {
        return kapazität;
    }

    public Status getRaumStatus() {
        return raumStatus;
    }

    protected void setRaumStatus(Status stat){
        this.raumStatus = stat;
    }

    public boolean isFree(){
        if (raumStatus == Status.frei) {
            return true;
        }else{
            return false;
        }
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

    @Override 
    public String toString(){
        return "Raumnummer: " + getRaumnummer() + "Kapazität: "+ getKapazität() + "Status: " + getRaumStatus();
    }
}

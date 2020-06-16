public class Trajet {

    private String villeDepart;
    private String villearrivee;
    private float kilmetrageDepart;
    private float kilmetrageArrivee;
    private Limousine limousine;


    public Trajet(String villeDepart, String villearrivee, float kilmetrageDepart, float kilmetrageArrivee, Limousine limousine) {
        this.villeDepart = villeDepart;
        this.villearrivee = villearrivee;
        this.kilmetrageDepart = kilmetrageDepart;
        this.kilmetrageArrivee = kilmetrageArrivee;
        this.limousine = limousine;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public String getVillearrivee() {
        return villearrivee;
    }

    public float getKilmetrageDepart() {
        return kilmetrageDepart;
    }

    public float getKilmetrageArrivee() {
        return kilmetrageArrivee;
    }

    public Limousine getLimousine() {
        return limousine;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public void setVillearrivee(String villearrivee) {
        this.villearrivee = villearrivee;
    }

    public void setKilmetrageDepart(float kilmetrageDepart) {
        this.kilmetrageDepart = kilmetrageDepart;
    }

    public void setKilmetrageArrivee(float kilmetrageArrivee) {
        this.kilmetrageArrivee = kilmetrageArrivee;
    }

    public void setLimousine(Limousine limousine) {
        this.limousine = limousine;
    }

    @Override
    public String toString(){
        return "ville Depart :" + villeDepart + " | ville arrivee " + villearrivee + "\n | kilmetrageDepart " + kilmetrageDepart + " | kilmetrageArrivee " + kilmetrageArrivee + "\n | limousine " + limousine + "\n";
    }
}

public class Limousine {

    private int numImmatriculation;
    private double capaciteReservoir;
    private int passager;
    private String couleur;


    public Limousine(int numImmatriculation, double capaciteReservoir, int passager, String couleur) {
        this.numImmatriculation = numImmatriculation;
        this.capaciteReservoir = capaciteReservoir;
        this.passager = passager;
        this.couleur = couleur;
    }

    public int getNumImmatriculation() {
        return numImmatriculation;
    }

    public double getCapaciteReservoir() {
        return capaciteReservoir;
    }

    public int getPassager() {
        return passager;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setNumImmatriculation(int numImmatriculation) {
        this.numImmatriculation = numImmatriculation;
    }

    public void setCapaciteReservoir(float capaciteReservoir) {
        this.capaciteReservoir = capaciteReservoir;
    }

    public void setPassager(int passager) {
        this.passager = passager;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "num Immatriculation :" + numImmatriculation + " | capacite Reservoir " + capaciteReservoir + " | passager " + passager + " | couleur " + couleur;
    }
}

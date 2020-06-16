public class Reservation {
    private int idReservation;
    private Limousine lim;
    private Chauffeur driver;

    public int getIdReservation() {
        return idReservation;
    }

    public Limousine getLim() {
        return lim;
    }

    public Chauffeur getDriver() {
        return driver;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public void setLim(Limousine lim) {
        this.lim = lim;
    }

    public void setDriver(Chauffeur driver) {
        this.driver = driver;
    }

    public Reservation(int idReservation, Limousine lim, Chauffeur driver) {
        this.idReservation = idReservation;
        this.lim = lim;
        this.driver = driver;
    }

    @Override
    public String toString(){
        return "id de reservation | " + idReservation + " | Limousine couleur | " + lim.getCouleur() + " chauffeur | " + driver.getNom();
    }
}

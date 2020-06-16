import java.util.ArrayList;
import java.util.Date;

public class Chauffeur {
    private String nom;
    private String prenom;
    private String anneeEmbauche;
    private String adresse;
    private ArrayList<Trajet> trajet;
    private  ArrayList<Limousine> limoDriven;




    public Chauffeur(String nom, String prenom, String anneeEmbauche, String adresse, ArrayList<Trajet> trajet, ArrayList<Limousine> limoDriven) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeEmbauche = anneeEmbauche;
        this.adresse = adresse;
        this.trajet = trajet;
        this.limoDriven = limoDriven;
    }
    public void setLimoDriven(ArrayList<Limousine> limoDriven) {
        this.limoDriven = limoDriven;
    }

    public ArrayList<Limousine> getLimoDriven() {
        return limoDriven;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAnneeEmbauche() {
        return anneeEmbauche;
    }

    public String getAdresse() {
        return adresse;
    }

    public ArrayList<Trajet> getTrajet() {
        return trajet;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnneeEmbauche(String anneeEmbauche) {
        this.anneeEmbauche = anneeEmbauche;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public void setTrajet(ArrayList<Trajet> trajet) {
        this.trajet = trajet;
    }

    public String getId(){

        String id = nom.substring(0,2).concat(prenom.substring(0).concat(anneeEmbauche.substring(2,4)));
        return id;
    }

    @Override
    public String toString() {
        return "chauffeur id :" + getId() + " | nom " + nom + " | prenom " + prenom + " | " + prenom + " | annee Embauche: " + anneeEmbauche + " | adresse  " + adresse + " | List des trajets  " + trajet + "| Listes des limousine conduite par ce chaffauer " + limoDriven + "\n";
    }


}

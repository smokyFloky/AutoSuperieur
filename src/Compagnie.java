import java.util.ArrayList;
import java.util.Arrays;

public class Compagnie {
    private ArrayList<Chauffeur> driver;
    private ArrayList<Limousine> limousine;

    public Compagnie(ArrayList<Chauffeur> driver, ArrayList<Limousine> limousine) {
        this.driver = driver;
        this.limousine = limousine;
    }


    @Override
    public String toString(){
        return "driver " + driver + " Limousine " + limousine + "\n";
    }
}

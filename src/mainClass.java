import java.util.ArrayDeque;
import java.util.ArrayList;

public class mainClass {

    public static void main(String[] args){



        ArrayList<Chauffeur> listChauffeur = new ArrayList<>();

        /*----------------------------------------------------*/



        ArrayList<Limousine> listLimousineDriver1 = new ArrayList<>();
        ArrayList<Limousine> listLimousineDriver2 = new ArrayList<>();
        ArrayList<Limousine> listLimousineDriver3 = new ArrayList<>();
        ArrayList<Limousine> listLimousineDriver4 = new ArrayList<>();

        /*----------------------------------------------------*/


        ArrayList<Trajet> listTrajetDriver1 = new ArrayList<>();
        ArrayList<Trajet> listTrajetDriver2 = new ArrayList<>();
        ArrayList<Trajet> listTrajetDriver3 = new ArrayList<>();
        ArrayList<Trajet> listTrajetDriver4 = new ArrayList<>();

        /*----------------------------------------------------*/





        /*----------------------------------------------------*/



        Limousine limo1 = new Limousine(111,3,8,"white");
        Limousine limo2 = new Limousine(222,4.0,7,"black");
        Limousine limo3 = new Limousine(333,5.0,10,"yellow");
        Limousine limo4 = new Limousine(423,5.4,12,"red");
        /*--------------------------------------------------------*/


        Trajet trajetDriver1 = new Trajet("Trois-Riv","Montreal",60000,60150,limo1);
        Trajet trajetDriver2 = new Trajet("Trois-Riv","LouisVill",75000,75050,limo2);
        Trajet trajetDriver3 = new Trajet("Montreal","Sherbrook",40000,40150,limo3);
        Trajet trajetDriver4 = new Trajet("Trois-Riv","Quebec City",80000,80150,limo4);

        /*----------------------------------------------------*/

        listLimousineDriver1.add(limo1);
        listLimousineDriver1.add(limo3);
        listLimousineDriver1.add(limo4);


        /*----------------------------------------------------*/

        listLimousineDriver2.add(limo2);
        listLimousineDriver2.add(limo4);

        /*----------------------------------------------------*/

        listLimousineDriver3.add(limo4);
        listLimousineDriver3.add(limo3);

        /*----------------------------------------------------*/

        listTrajetDriver1.add(trajetDriver1);
        listTrajetDriver1.add(trajetDriver3);
        /*----------------------------------------------------*/

        listTrajetDriver2.add(trajetDriver2);
        listTrajetDriver2.add(trajetDriver4);

        /*----------------------------------------------------*/

        listTrajetDriver3.add(trajetDriver3);
        listTrajetDriver3.add(trajetDriver1);

        /*----------------------------------------------------*/

        Chauffeur driver1 = new Chauffeur("Mike","jim","2010","Blvrd YYY",listTrajetDriver1,listLimousineDriver1);
        driver1.getId();

        Chauffeur driver2 = new Chauffeur("Hamel","Louis","2011","Blvrd YYY",listTrajetDriver2,listLimousineDriver2);
        driver2.getId();
        Chauffeur driver3 = new Chauffeur("Wang","Xuxun","2009","Blvrd YYY",listTrajetDriver3,listLimousineDriver3);
        driver3.getId();


        listChauffeur.add(driver1);
        listChauffeur.add(driver2);
        listChauffeur.add(driver3);


       /* Listtrajet.add(trajetDriver1);
        Listtrajet.add(trajetDriver2);*/

        System.out.println("list des chauffeurs avec trajets effectués \n" + listChauffeur);

        Reservation res = new Reservation(111,limo1,driver1);

        System.out.println("Information de reseravation \n " + res);


        /*Compagnie AutoSuperieur = new Compagnie(listChauffeur,listLimousine);

        System.out.println("List des chauffeurs et des limousines \n" +AutoSuperieur);*/

    }
}

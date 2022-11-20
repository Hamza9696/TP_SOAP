
import java.util.ArrayList; // import the ArrayList class



public class hotel {

    private String nom;
    private int nbEtoiles;
    private double price;
    private ArrayList<String> chambre;  
    private adresse adress; 

    public hotel() {}  
    public hotel(String nom, int nbEtoiles, double price, ArrayList<String> chambre, adresse adress) {  
        this.nom = nom;                                                          
        this.nbEtoiles = nbEtoiles;
        this.price = price;
        this.chambre = chambre;
        this.adress = adress;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNbEtoiles() {
        return nbEtoiles;
    }
    public void setNbEtoiles(int nbEtoiles) {
        this.nbEtoiles = nbEtoiles;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public ArrayList<String> getChambre() {
        return chambre;
    }
    public void setChambre(ArrayList<String> chambre) {
        this.chambre = chambre;
    } 

    public adresse getAdress() {
        return adress;
    }
    public void setAdress(adresse adress) {
        this.adress = adress;
    }

    public String toString() {

        return ("Hotel " + nom + " à " + nbEtoiles + " étoiles, à un prix de " + price + " et contient ces chambres " + chambre + " et il est situé à | " + adress.toString()); 
    }

}

// hotel h1 = new hotel(Ibiza, 4, ["9m","12m","15m"]);
// hotel h2 = new hotel(Cordoba, 3, ["10m","12m"]);
// hotel h3 = new hotel(Cesar, 5, ["9m","12m","15m","20m"]);
// hotel h4 = new hotel(Iberia, 2, ["9m"]);
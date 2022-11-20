import java.util.*;  



public class client {

    private String nom; 
    private String prenom;
    private String card;

    public client() {}  
    public client(String nom, String prenom, String card) {  

        this.nom = nom;     
        this.prenom = prenom;                                                      
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getCard() {
        return card;
    }
    public void setCard(String card) {
        this.card = card;
    }
}



import java.util.*;  



public class client {

    private String nom; 
    private String prenom;

    public client() {}  
    public client(String nom, String prenom) {  

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

    //Create scanner object and read the value from the console  
    Scanner sc = new Scanner(System.in);  
    
    // Vermeil
	//System.out.println("Veuillez entrer une ville de sejour");
	String ville = sc.next();
}



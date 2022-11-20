
public class adresse {

    private String ville;
    private String rue;
    private int number;  

    public adresse() {}  
    public adresse(String ville, String rue, int number) {  
        this.ville = ville;                                                          
        this.rue = rue;
        this.number = number;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    } 

    public String toString() {

        return ("Ville " + ville + " , Rue :  " + rue + ", Numero :  " + number + " | "); 
    }

}

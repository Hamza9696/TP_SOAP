
import java.util.ArrayList; // import the ArrayList class


public class chambre {

    private int nbLits;
    private int numero;
    private hotel Hotel;  
    private ArrayList<reservation> reservations;

    public chambre() {}  
    public chambre(int nbLits, int numero, hotel Hotel, ArrayList<reservation> reservations) {  
        this.nbLits = nbLits;                                                          
        this.numero = numero;
        this.Hotel = Hotel;
    }
    public int getNbLits() {
        return nbLits;
    }
    public void setNbLits(int nbLits) {
        this.nbLits = nbLits;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public hotel getHotel() {
        return Hotel;
    }
    public void setHotel(hotel hotel) {
        Hotel = hotel;
    }
    public static void add(String string) {
    } 

    public ArrayList<reservation> getReservations() {
        return reservations;
    }
    public void setReservations(ArrayList<reservation> reservations) {
        this.reservations = reservations;
    }

}
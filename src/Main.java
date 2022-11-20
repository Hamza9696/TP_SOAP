
import java.util.ArrayList; // import the ArrayList class


public class Main {
	public static void main(String[] args) { 

        ArrayList<hotel> hotels = new ArrayList<hotel>();


        /// les données seront codées en dur dans le code /// 

        //////// Hotel 1 //

        hotel h1 = new hotel();
        h1.setNom("Ibiza");
        h1.setNbEtoiles(4);
        h1.setPrice(32);
        ArrayList<String> ch = new ArrayList<String>();
        ch.add("9m");
        ch.add("10m");
        ch.add("12m");
        h1.setChambre(ch);

        adresse adr = new adresse("Sevilla", "Galeria", 13);

        h1.setAdress(adr);

        System.out.println(h1.getNom()); 
        System.out.println(h1.getNbEtoiles()); 
        System.out.println(h1.getChambre()); 

        //////// Hotel 2

        hotel h2 = new hotel();
        h2.setNom("Cordoba");
        h2.setNbEtoiles(3);
        h2.setPrice(22);
        ArrayList<String> ch1 = new ArrayList<String>();
        ch1.add("10m");
        ch1.add("12m");
        h2.setChambre(ch1);

        System.out.println(h2.getNom()); 
        System.out.println(h2.getNbEtoiles()); 
        System.out.println(h2.getChambre()); 

        adresse adr2 = new adresse("Madrid", "Tonella", 25);

        h2.setAdress(adr2);


        //hotel h2 = new hotel("Cordoba", 3, {"10m","12m");
        //hotel h3 = new hotel("Cesar", 5, ["9m","12m","15m","20m"]);
        //hotel h4 = new hotel("Iberia", 2, ["9m"]);

        // -----------------add hotel to the ArrayList hotels
                hotels.add(h1);
                hotels.add(h2);

        System.out.println(hotels.get(0).toString()); 
        System.out.println("//////////////////////////////////////////"); 
        System.out.println(h1.toString()); 
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||"); 
        System.out.println(hotels.get(1).toString()); 
} 

}
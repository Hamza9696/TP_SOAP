
import java.util.ArrayList; // import the ArrayList class
import java.util.Date;
import java.util.Scanner;  // Import the Scanner class
import java.text.SimpleDateFormat;  
import java.text.ParseException; 

public class Main {
	public static void main(String[] args) throws ParseException { 

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

        Scanner myObj = new Scanner(System.in);
        System.out.println("---------------------------------------------");  
        System.out.println("Une ville de séjour, une date d’arrivée, une date de départ, un intervalle de prix souhaité, une catégorie d’hôtel : nombre d’étoiles, le nombre de personnes à héberger : ");

        // String input
        String ville = myObj.nextLine();

        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        // Numerical input
        String dateArr = myObj.nextLine();
        String dateDep = myObj.nextLine();
        Date dateArrive = sdf.parse(dateArr);  
        Date dateDepart = sdf.parse(dateDep); 
        double max = myObj.nextDouble();
        double min = myObj.nextDouble();
        int stars = myObj.nextInt();
        int nbPersons = myObj.nextInt();





        // Output input by user
        System.out.println("ville de sejour : " + ville);
        //System.out.println("dateArrive : " + dateArrive);
        //System.out.println("dateDepart : " + dateDepart);
                    ////// Formated date
        System.out.println("Date ARRIVE: " + sdf.format(dateArrive));  
        System.out.println("Date DEPART: " + sdf.format(dateDepart)); 
        /////////////
                    ////// Compare date
        if(dateArrive.compareTo(dateDepart) < 0)   
        {  
        System.out.println("dateArrive comes before dateDepart");  
        }   
        /////////////////////
        System.out.println("Prix max : " + max);
        System.out.println("Prix min : " + min);
        System.out.println("Stars: " + stars);
        System.out.println("Nombre de personnes: " + nbPersons);

        for (hotel h : hotels) {
            System.out.println(h.getAdress().toString());
            
          }
        
        //utilisateur de saisir les informations suivantes : Une ville de séjour, une date d’arrivée, 
        //une date de départ, un intervalle de prix souhaité, 
        //une catégorie d’hôtel : nombre d’étoiles, le nombre de personnes à héberger.
        /////////////////
        //Enréponse, l’application lui retourne une liste d’hôtels qui répondent à ses critères et où pour chaque hôtel les informations suivantes 
        //sont affichées : nom de l’hôtel, adresse de l’hôtel (pays, ville, rue, numéro, lieu-dit, position GPS), le prix à payer, nombre d’étoile, nombre de lits proposés
            
} 

}
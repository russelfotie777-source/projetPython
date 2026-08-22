import java.util.Scanner;


public class heelo {
    public static void main(String[] args)
    {
        //Projet Cobvertisseurs
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez Votre nom : ");
        String nom = sc.nextLine();
        System.out.print("Entrez le poid en Km : ");
        double poids = sc.nextDouble();
        System.out.println("Entrer le KG : ");
        double kg = sc.nextDouble();

        double conversion = poids * 1000;

        System.out.println("Entrer la température en Celsius : ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Bonjour " + nom + " le poid en gramme est : " + conversion + "g");
        System.out.println("Le poid en Kg est : " + kg + "Kg");
        System.out.println("La température en Fahrenheit est : " + fahrenheit + "°F");


        
        
    }
}
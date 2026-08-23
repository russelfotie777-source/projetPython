
import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
    Scanner nombre = new Scanner(System.in);
    int nombreMistere = (int)(Math.random() * 100)+1;
    int nombreTentative = 0;
    int proposition = 0;

     while(proposition != nombreMistere)
     {
         System.out.println("Entrer un epropositon entre 1 et 100 : ");
         proposition = nombre.nextInt();
         nombreTentative++;
            if(proposition < nombreMistere)
            {
                System.out.println("Le nombre est plus grand que " + proposition);
            }
            else if (proposition > nombreMistere)
            {
                System.out.println("Le nombre est plus petit que " + proposition);
            }
            else
            {
                System.out.println("Bravo ! Vous avez trouvé le nombre mystère en " + nombreTentative + " tentatives.");
            }
     }
     nombre.close();
   }
  
}

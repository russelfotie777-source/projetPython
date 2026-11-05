import java.util.Scanner;

public class structure {
    public static void main(String[] args)
    {
         
        Scanner scanner =  new Scanner(System.in);
        int nombre;

        do {
            System.out.println("Entrer un nombre Positif ");
            nombre = scanner.nextInt();
        } while (nombre <= 0);
        for (int i = 0; i < nombre; i++) {
            System.out.println("Entrer un nombre ");
        }
        while (int i = 0; i < nombre; i++) {
            System.out.println("Entrer un nombre ");
            i++;
            
        }
                while (int j = 0; j < nombre; j++) {
            System.out.println("Entrer un nombre J ");
            j++;
            
        }

        scanner.close();
    }
}
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

        scanner.close();
    }
}
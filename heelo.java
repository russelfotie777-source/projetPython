
import java.util.Scanner;
public class heelo {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    int nombre = scanner.nextInt();

    //comparaison
     if (nombre > 0) {
        System.out.println("Le nombre est positif.");

    }else if (nombre < 0) {
        System.out.println("Le nombre est négatif.");
    } else {
        System.out.println("Le nombre est zéro.");
    }
}
}
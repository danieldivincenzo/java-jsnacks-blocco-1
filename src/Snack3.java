import java.util.Scanner;
public class Snack3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero intero: ");
            int numeroUtente = scan.nextInt();
            somma = somma + numeroUtente;
        }
        System.out.println("La somma dei numeri inseriti è: " + somma);
    }
}

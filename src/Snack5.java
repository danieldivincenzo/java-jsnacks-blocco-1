import java.util.Scanner;
public class Snack5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Inserisci un numero intero: ");
            int numeroUtente = scan.nextInt();
            if (numeroUtente % 2 == 1) {
                System.out.println("Il numero inserito è dispari");
            }
        }
    }
}

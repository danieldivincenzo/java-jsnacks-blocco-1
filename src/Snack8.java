import java.util.Scanner; 
public class Snack8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un numero a 4 cifre: ");
        int numeroUtente = scan.nextInt();
        
        int primaCifra = numeroUtente % 10;
        int secondaCifra = (numeroUtente / 10) % 10;
        int terzaCifra = (numeroUtente / 100) % 10;
        int quartaCifra = (numeroUtente / 1000) % 10;

        int somma = primaCifra + secondaCifra + terzaCifra + quartaCifra;
        System.out.println("La somma dei numeri che compongono quello che hai inserito è: " + somma);
    }
}

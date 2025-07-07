import java.util.Scanner;
public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomi[] = {"Mario Rossi", "Giorgio Verdi", "Luca Neri", "Alice Gialli", "Lucia Violi", "Sara Rosi"};

        System.out.println("Inserisci il tuo nome: ");
        String nomeUtente = scan.nextLine();
        for (int i = 0; i < nomi.length; i++) {
            if (nomeUtente.equalsIgnoreCase(nomi[i])) {
                System.out.println("Puoi entrare, benvenuto.");
            }else{
                System.out.println("Non puoi entrare, vattene.");
            }break;
        }
    }
}

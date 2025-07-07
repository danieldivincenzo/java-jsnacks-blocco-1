import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inserisci il primo numero: ");
        int primoNumero = scan.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int secondoNumero = scan.nextInt();

        if (primoNumero > secondoNumero) {
            System.out.println("Il numero maggiore è: " + primoNumero);
        }else if (primoNumero < secondoNumero){
            System.out.println("Il numero maggiore è: " + secondoNumero);
        }else {
            System.out.println("I due numeri sono uguali");
        }

    }
}

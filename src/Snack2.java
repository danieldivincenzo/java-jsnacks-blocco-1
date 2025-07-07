import java.util.Scanner;
public class Snack2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inserisci la prima parola: ");
        String primaParola = scan.next();
        
        System.out.println("Inserisci la seconda parola: ");
        String secondaParola = scan.next();

        if (primaParola.length() > secondaParola.length()) {
            System.out.println(primaParola);
            System.out.println(secondaParola);
        }else if (secondaParola.length() > primaParola.length()) {
            System.out.println(secondaParola);
            System.out.println(primaParola);
        }else{
            System.out.println("Le due parole sono lunghe uguali");
        }
    }
}

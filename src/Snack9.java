public class Snack9 {
    public static void main(String[] args) {
        int somma = 0;
        for (int i = 1; i <= 10; i++) {
            somma = somma + i;
        }

        double media = (double) somma / 10;
        
        System.out.println("La somma dei primi 10 numeri è: " + somma);
        System.out.println("La media dei primi 10 numeri è: " + media);
    }
}

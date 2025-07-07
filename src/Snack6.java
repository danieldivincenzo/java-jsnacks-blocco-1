import java.util.Scanner;
public class Snack6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Di quanti primi N numeri vuoi il cubo?");
        int numeroCubi = scan.nextInt();
        double cubi = 0;
        for (int i = 1; i <= numeroCubi; i++) {
            cubi = Math.pow(i, 3);
            int cubiInteri = (int) cubi;
            System.out.println(cubiInteri);
        }
    }
}

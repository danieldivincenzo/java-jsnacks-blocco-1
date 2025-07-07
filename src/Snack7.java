public class Snack7 {
    public static void main(String[] args) {
        double potenze = 0;
        for (int i = 1; i <= 1000; i++) {
            potenze = Math.pow(i, 2);
            int potenzeIntere = (int) potenze;
            System.out.println(potenzeIntere);
        }
    }
}

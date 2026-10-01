public class Main {
    public static void main(String[] args) {

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.printf("%d * %d = %-2d ", a, b, a * b);
            }
            System.out.println();
        }
    }
}
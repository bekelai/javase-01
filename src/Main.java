public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int b = 1; b <= i; b++) {
                System.out.printf("%d * %d = %-2d ", i, b, i * b);
            }
            System.out.println();
        }
    }
}

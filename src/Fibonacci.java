import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("项数：");
        int n = sc.nextInt();
        System.out.println("斐波那契数列第" + n + "项:" + fib(n));
        sc.close();
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortLambda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数组长度:");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("输入数组:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> a - b);

        System.out.print("排序后：");
        Arrays.asList(arr).forEach(x -> System.out.print(x + " "));

        sc.close();
    }
}

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9) digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }
        int[] plus = new int[n + 1];
        plus[0] = 1;
        return plus;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits1)));
        int[] digits2 = {1, 2, 9};
        System.out.println(Arrays.toString(plusOne(digits2)));
        int[] digits3 = {9};
        System.out.println(Arrays.toString(plusOne(digits3)));
        int[] digits4 = {9, 9};
        System.out.println(Arrays.toString(plusOne(digits4)));
    }

}

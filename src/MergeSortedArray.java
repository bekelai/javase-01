import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        merge(num1, m, num2, n);
        System.out.println(Arrays.toString(num1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;          // nums1有效数字末尾
        int j = n - 1;          // nums2末尾
        int k = m + n - 1;      // nums1末尾
        while (j>=0){
            if(i>=0&&nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
    }
}

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int slow = 0;
        for (int fast = 0; fast < nums.length - 1; fast++) {
            if (nums[fast] != nums[fast + 1]) {
                nums[slow + 1] = nums[fast + 1];
                slow++;
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = {1, 2, 2};
        System.out.println(removeDuplicates(nums1) + " " + Arrays.toString(nums1));
        System.out.println(removeDuplicates(nums2) + " " + Arrays.toString(nums2));
    }

}

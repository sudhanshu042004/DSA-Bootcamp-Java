import java.util.Arrays;

public class evenNum {
    public static void main(String[] args) {
        int[] nums = new int[]{122,3455,26,61,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int evens = 0;
        for (int row = 0; row < nums.length; row++) {
            int element = nums[row];
            int digitLength = ((int) (Math.log10(element) + 1));
            if (digitLength % 2 == 0) {
                evens += 1;
            }

        }
        return evens;
    }
}

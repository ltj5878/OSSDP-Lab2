import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022211844_X_Test {

    @Test
    public void testMaximumGap() {
        Solution4 solution = new Solution4();

        // Test case 1: Normal case with a valid array
        int[] nums1 = {3, 6, 9, 1};
        assertEquals(3, solution.maximumGap(nums1));

        // Test case 2: Edge case with only one element
        int[] nums2 = {10};
        assertEquals(0, solution.maximumGap(nums2));

        // Test case 3: Two elements with maximum difference
        int[] nums3 = {1, 100};
        assertEquals(99, solution.maximumGap(nums3));

        // Test case 4: All elements are the same
        int[] nums4 = {5, 5, 5, 5};
        assertEquals(0, solution.maximumGap(nums4));

        // Test case 5: Large range with small gap
        int[] nums5 = {1, 3, 5, 7, 9, 11, 100};
        assertEquals(89, solution.maximumGap(nums5));

        // Test case 6: Negative and positive numbers
        int[] nums6 = {-1, -2, -3, 1, 2, 3};
        assertEquals(2, solution.maximumGap(nums6));

        // Test case 7: Large numbers
        int[] nums7 = {0, 1000000000, 500000000};
        assertEquals(500000000, solution.maximumGap(nums7));

        // Test case 8: Random values
        int[] nums8 = {10, 20, 30, 5, 15};
        assertEquals(10, solution.maximumGap(nums8));
    }
}

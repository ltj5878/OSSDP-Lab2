import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022211844_X_Test {
    private Solution4 solution;
    @Test
    public void maximumGap_EmptyArray_Returns0() {
        int[] nums = {};
        assertEquals(0, solution.maximumGap(nums));
    }

    @Test
    public void maximumGap_SingleElementArray_Returns0() {
        int[] nums = {5};
        assertEquals(0, solution.maximumGap(nums));
    }

    @Test
    public void maximumGap_TwoElementsArray_ReturnsDifference() {
        int[] nums = {5, 2};
        assertEquals(3, solution.maximumGap(nums));
    }

    @Test
    public void maximumGap_MultipleElementsArray_ReturnsMaxGap() {
        int[] nums = {3, 6, 9, 1, 2, 4, 5, 8, 7};
        assertEquals(3, solution.maximumGap(nums));
    }

    @Test
    public void maximumGap_ArrayWithNegativeNumbers_ReturnsMaxGap() {
        int[] nums = {-1, -3, -5, 0, 2, 4, 6};
        assertEquals(5, solution.maximumGap(nums));
    }

    @Test
    public void maximumGap_ArrayWithSameNumbers_Returns0() {
        int[] nums = {5, 5, 5, 5, 5};
        assertEquals(0, solution.maximumGap(nums));
    }

    @Test
    public void maximumGap_ArrayWithLargeNumbers_ReturnsMaxGap() {
        int[] nums = {1000000000, 500000000, 250000000, 125000000, 62500000};
        assertEquals(375000000, solution.maximumGap(nums));
    }
}

import java.util.Arrays;

/**
 * @description:
 *
 * 给定一个无序的数组 nums，返回 数组在排序之后，相邻元素之间最大的差值 。如果数组元素个数小于 2，则返回 0 。
 *
 * 您必须编写一个在「线性时间」内运行并使用「线性额外空间」的算法。
 *
 *
 *
 * 示例 1:
 *
 * 输入: nums = [3,6,9,1]
 * 输出: 3
 * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
 * 示例 2:
 *
 * 输入: nums = [10]
 * 输出: 0
 * 解释: 数组元素个数小于 2，因此返回 0。
 *
 *
 * 提示:
 *
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 109
 *
 */
class Solution4 {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }

        // 找到最大值和最小值
        int minVal = Arrays.stream(nums).min().getAsInt();
        int maxVal = Arrays.stream(nums).max().getAsInt();

        // 计算桶的大小
        int bucketSize = Math.max(1, (maxVal - minVal) / (n - 1)); // 确保至少为1
        int bucketCount = (maxVal - minVal) / bucketSize + 1;

        int[][] buckets = new int[bucketCount][2]; // 每个桶有两个元素，存放最小值和最大值
        for (int i = 0; i < bucketCount; i++) {
            buckets[i][0] = Integer.MAX_VALUE; // 初始化为最大值
            buckets[i][1] = Integer.MIN_VALUE; // 初始化为最小值
        }

        // 将元素放入桶中
        for (int num : nums) {
            int idx = (num - minVal) / bucketSize;
            buckets[idx][0] = Math.min(buckets[idx][0], num);
            buckets[idx][1] = Math.max(buckets[idx][1], num);
        }

        // 计算相邻桶之间的最大差值
        int prevMax = minVal;
        int maxGap = 0;
        for (int[] bucket : buckets) {
            if (bucket[0] == Integer.MAX_VALUE) {
                continue; // 空桶
            }
            maxGap = Math.max(maxGap, bucket[0] - prevMax);
            prevMax = bucket[1];
        }

        return maxGap;
    }
}
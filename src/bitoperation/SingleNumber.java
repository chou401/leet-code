package bitoperation;

/**
 * {@code @author} JSY
 * {@code @date} 2023/2/20
 * {@code @className} SingleNumber
 * {@code @description} leetcode 136 只出现一次的数字
 * <p>
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 * <p>
 * 示例 1 ：
 * <p>
 * 输入：nums = [2,2,1]
 * 输出：1
 * 示例 2 ：
 * <p>
 * 输入：nums = [4,1,2,1,2]
 * 输出：4
 * 示例 3 ：
 * <p>
 * 输入：nums = [1]
 * 输出：1
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * 除了某个元素只出现一次以外，其余每个元素均出现两次。
 */
public class SingleNumber {
    // todo
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}

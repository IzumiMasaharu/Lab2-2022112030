import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class L2022212015_16_Test {
    /**
     *  测试设计原则：等价类划分和边界值分析原则。
     * 等价类划分将输入域划分为若干部分（等价类），这样可以减少需要编写的测试用例数量。
     * 边界值分析关注的是输入域的边界值，它认为错误更容易出现在输入范围的边界上，特别关注最小值、最大值、零值等情况。
     */
    private final Solution solution = new Solution();
    /**
     * 测试目的：验证当输入数组为空时，返回空字符串。
     * 测试用例：[]
     */
    @Test
    void testLargestNumberWithEmptyArray() {
        int[] nums = new int[]{};
        assertEquals("", solution.largestNumber(nums));
    }

    /**
     * 测试目的：验证当输入数组只包含一个元素时，返回该元素。
     * 测试用例：[100]
     */
    @Test
    void testLargestNumberWithSingleElementArray() {
        assertEquals("100", solution.largestNumber(new int[]{100}));
    }

    /**
     * 测试目的：验证当输入数组包含重复元素时，返回正确的大整数。
     * 测试用例：[3, 30, 34, 5, 9]
     */
    @Test
    void testLargestNumberWithDuplicateElements() {
        assertEquals("9534330", solution.largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    /**
     * 测试目的：验证当输入数组包含零时，返回零。
     * 测试用例：[0, 0, 0]
     */
    @Test
    void testLargestNumberWithZeros() {
        assertEquals("0", solution.largestNumber(new int[]{0, 0, 0}));
    }

    /**
     * 测试目的：验证当输入数组包含较大范围内的数字时，返回正确的大整数。
     * 测试用例：[121, 12]
     */
    @Test
    void testLargestNumberWithLargeNumbers() {
        assertEquals("12121", solution.largestNumber(new int[]{121, 12}));
    }

    /**
     * 测试目的：验证当输入数组包含较小的正整数时，返回正确的大整数。
     * 测试用例：[1, 2, 3]
     */
    @Test
    void testLargestNumberWithSmallNumbers() {
        assertEquals("321", solution.largestNumber(new int[]{1, 2, 3}));
    }

    /**
     * 测试目的：验证当输出超过int大小仍可以正常工作
     * 测试用例：[123456789，987654321]
     */
    @Test
    void testLargestNumberWithLongOutput() {
        assertEquals("987654321123456789", solution.largestNumber(new int[]{123456789,987654321}));
    }
}

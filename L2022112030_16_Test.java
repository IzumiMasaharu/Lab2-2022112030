import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class L2022112030_16_Test
{

    /*
     * 测试用例设计总体原则：
     * 1. 等价类划分：划分了输入的整数集合为包含大数、单一数字、重复数字、零等情况，设计了不同场景的测试。
     * 2. 边界值分析：检查数组长度为1、多个零输入等边界情况。
     * 3. 错误推测法：考虑极端情况如输入全为0的情况。
     */

    @Test
    void testLargestNumber_case1()
    {
        // 测试目的：测试标准用例，包含多个整数，能够形成一个最大值。
        // 测试用例：[3, 30, 34, 5, 9]
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(new int[]{3, 30, 34, 5, 9});
        // 期望输出："9534330"
        assertEquals("9534330", result);
    }

    @Test
    void testLargestNumber_case2()
    {
        // 测试目的：测试数组只有一个元素的情况。
        // 测试用例：[1]
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(new int[]{1});
        // 期望输出："1"
        assertEquals("1", result);
    }

    @Test
    void testLargestNumber_case3()
    {
        // 测试目的：测试所有元素为0的情况。
        // 测试用例：[0, 0, 0]
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(new int[]{0, 0, 0});
        // 期望输出："0"
        assertEquals("0", result);
    }

    @Test
    void testLargestNumber_case4()
    {
        // 测试目的：测试包含两个数字的情况，选择比较顺序。
        // 测试用例：[10, 2]
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(new int[]{10, 2});
        // 期望输出："210"
        assertEquals("210", result);
    }

    @Test
    void testLargestNumber_case5()
    {
        // 测试目的：测试数组包含大数字的情况，确保拼接顺序正确。
        // 测试用例：[121, 12]
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(new int[]{121, 12});
        // 期望输出："12121"
        assertEquals("12121", result);
    }

    @Test
    void testLargestNumber_case6()
    {
        // 测试目的：测试包含多个大数字和小数字的情况，验证排序正确性。
        // 测试用例：[9, 92, 923, 91]
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(new int[]{9, 92, 923, 91});
        // 期望输出："92392919"
        assertEquals("99292391", result);
    }

    @Test
    void testLargestNumber_case7()
    {
        // 测试目的：测试边界值，数组只有两个元素，保证正确拼接。
        // 测试用例：[9, 34]
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(new int[]{9, 34});
        // 期望输出："934"
        assertEquals("934", result);
    }

    @Test
    void testLargestNumber_case8()
    {
        // 测试目的：测试边界情况，输入一个包含非常大的数字。
        // 测试用例：[9998765, 998679321]
        Solution16 solution = new Solution16();
        String result = solution.largestNumber(new int[]{9998765, 998679321});
        // 期望输出："999998"
        assertEquals("9998765998679321", result);
    }
}

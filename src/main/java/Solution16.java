import java.util.*;

/*
 * @Description
 * 最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 */
class Solution {
    public String largestNumber(int[] nums)
    {
        int n = nums.length;
        if (n == 0)
        { // 处理空数组的情况
            return "";
        }
        // 转换成包装类型，以便传入 Comparator 对象（此处为 lambda 表达式）
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++)
        {
            numsArr[i] = nums[i];
        }

//        Arrays.sort(numsArr, (x, y) -> {
//            long concatXY = Long.parseLong(x + "" + y); // 拼接 x 和 y
//            long concatYX = Long.parseLong(y + "" + x); // 拼接 y 和 x
//            return Long.compare(concatYX, concatXY); // 降序排列
//        });
        /*
         * 建议使用以下代码
         * 以防止两个Int拼接后出现的溢出问题
         */
        Arrays.sort(numsArr, (x, y) ->
        {
            String s1 = String.valueOf(x) + String.valueOf(y);
            String s2 = String.valueOf(y) + String.valueOf(x);
            return s2.compareTo(s1);  // 反向比较，保证大的数字在前
        });

        if (numsArr[0] == 0)
        {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        for (int num : numsArr)
        {
            ret.append(num);
        }
        return ret.toString();
    }
}
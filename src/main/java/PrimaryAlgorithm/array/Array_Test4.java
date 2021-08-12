package PrimaryAlgorithm.array;

/**
 * @author zqs
 * @create 2021-08-05 19:50
 */

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */
public class Array_Test4 {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!temp.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testContainsDuplicate() {
//        int[] nums = new int[]{1, 2, 3, 1};
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
//        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        boolean b = containsDuplicate(nums);
        boolean b1 = containsDuplicate1(nums);
        boolean b2 = containsDuplicate2(nums);
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
    }
}

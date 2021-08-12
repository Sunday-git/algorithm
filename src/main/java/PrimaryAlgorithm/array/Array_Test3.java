package PrimaryAlgorithm.array;

/**
 * @author zqs
 * @create 2021-08-05 19:50
 */

import org.junit.Test;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Array_Test3 {

    //1,2,3,4,5,6,7
    public int[] rotate(int[] nums, int k) {
        int len = nums.length;
        int temp[] = new int[len];
        for (int i = 0; i < len; i++) {
            temp[i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[(i + k) % len] = temp[i];
        }
        return nums;
    }

    @Test
    public void testRotate() {
//        int[] prices = new int[]{1,2,1,4,5};
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
//        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int[] num2 = rotate(nums, k);
        for (int i : num2) {
            System.out.print(i + "\t");
        }
    }
}

package PrimaryAlgorithm.array;

/**
 * @author zqs
 * @create 2021-08-05 19:50
 */

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class Array_Test1 {

    //0,0,1,1,1,2,2,3,3,4
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int count = 1;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int removeDuplicates = removeDuplicates(nums);
        System.out.println(removeDuplicates);
    }
}

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author zqs
 * @create 2021-06-11 11:57
 */
public class Test1_SumTwo {


    public static int[] addints(int[] res, int i, int j) {
        int[] res2 = new int[res.length + 2];
        for (int z = 0; z < res.length; z++) {
            res2[z] = res[z];
        }
        res2[res2.length - 2] = i;
        res2[res2.length - 1] = j;
        return res2;
    }

    /**
     * @param nums   = {2, 3, 4}
     * @param target = 6
     * @return
     */

    //多种结果
    public static int[] sumTwo4(int[] nums, int target) {

        int[] res = {};
        int i = 0;
        ArrayList list = new ArrayList();
        while (i < nums.length) {
            int j = i + 1;
            while (j < nums.length) {
                if (target == nums[i] + nums[j]) {
                    list.add(i);
                    list.add(j);
                }
                j++;
            }
            i++;
        }
        return res;
    }

    public static int[] sumTwo3(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            while (j < nums.length) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
                j++;
            }
        }
        return null;
    }


    public static int[] sumTwo2(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public static int[] sumTwo5(int[] nums, int target) {
        int[] res = new int[100];
        for (int i = 0; i < nums.length; i++) {
            if (res[target-nums[i]]!=0) {
                return new int[]{ res[ target-nums[i] ]  ,  i };
            }
            res[nums[i]]=i;
        }
        return null;
    }
    public static int[] sumTwo1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target-nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2, 3, 4};
        int target = 6;

        int[] sumTwo = sumTwo5(nums, target);
        System.out.println(Arrays.toString(sumTwo));
    }
}

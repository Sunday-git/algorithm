import org.junit.Test;

/**
 * @author zqs
 * @create 2021-06-14 14:19
 */
public class Test2_MountainArr {

    //山脉数组

    public static int mountainArr() {

//        int[] arr = new int[]{0, 1, 0};
//        int[] arr = new int[]{0, 2, 1, 0};
//        int[] arr = new int[]{0, 10, 5, 2};
//        int[] arr = new int[]{3, 4, 5, 1};
//        int[] arr = new int[]{18, 29, 38, 59, 98, 100, 99, 98, 90};
        int[] arr = new int[]{12, 13, 19, 41, 55, 69, 70, 71, 96, 72};
        int flag = 0;
        int tar = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > flag) {
                flag = arr[i];
                tar = i;
            }
        }
        return tar;
    }

    public int mountainArr2(int[] arr) {
//        int[] arr = new int[]{0, 1, 0};
//        int[] arr = new int[]{0, 2, 1, 0};
//        int[] arr = new int[]{0, 10, 5, 2};
//        int[] arr = new int[]{3, 4, 5, 1};
//        int[] arr = new int[]{3, 4, 5, 4, 3};
//        int[] arr = new int[]{18, 29, 38, 59, 98, 100, 99, 98, 90};
//        int[] arr = new int[]{12, 13, 19, 41, 55, 69, 70, 71, 96, 72};
        int low = 0;
        int high = arr.length;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }

    @Test
    public void test() {
        System.out.println(mountainArr2(new int[]{3, 5, 3, 2, 0}));
    }
}
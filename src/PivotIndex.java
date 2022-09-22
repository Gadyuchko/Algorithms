public class PivotIndex {

    static int pivotIndex(int[] nums) {
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;
            int y =i;
            int j=i;
            while (y >= 0 && y < nums.length-1) {
                right += nums[y+1];
                y++;
            }
            while (j >= 1 && j < nums.length) {
                left += nums[j- 1];
                j--;
            }
            if (left == right) {
                index = i;
                break;
            }
        }

        return index;
    }
}

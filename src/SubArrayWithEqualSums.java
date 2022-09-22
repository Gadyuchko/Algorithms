import java.util.HashSet;
import java.util.Set;

public class SubArrayWithEqualSums {
    public static void main(String[] args) {
        int[] a = new int[] {0, 0, 0, 4, 5};
        System.out.println(findSubarrays(a));
    }
    static boolean findSubarrays(int[] nums) {
        Set<Integer> sums = new HashSet<>();

        boolean flag = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (!sums.add(nums[i] + nums[i + 1])) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int maximumRows(int[][] mat, int cols) {
//        int rows = mat.length;
//        int[] count = new int[mat.length];
//        for(int i=0; i<mat.length; i++){
//            for(int y=0; y<mat[i].length; y++){
//                int e = mat[i][y];
//                int sum += e;
//                if (sum>cols){
//                    break;
//                }
//            }
//        }
        return 1;
    }
}

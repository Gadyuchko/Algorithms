import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] ints5 = {7, 8};
        System.out.println(Arrays.toString(twoSum(ints5, 15)));
    }
    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int d = target-nums[i];
            if(map.containsKey(d)){
                result[0]=map.get(d);
                result[1]=i;
                break;
            }map.put(nums[i], i);
        }return result;
    }
}

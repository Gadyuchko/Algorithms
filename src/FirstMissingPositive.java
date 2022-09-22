public class FirstMissingPositive {

    public static int firstMissingPositive(int[] nums) {
        int n = 1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>0 ){
                if(nums[i]<n){
                    n=nums[i];
                }return n;
            }
        }return -1;
    }
}

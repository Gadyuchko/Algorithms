public class ClimbingSteps {
    public static void main(String[] args) {
        int[] ints5 = {1, 2, 5, 1, 3, 5};
        int[] ints1 = {10,15,20};
//        System.out.println(climbStairs(1));
        System.out.println(minCostClimbingStairs(ints5));
    }

    static int climbStairs(int n) {
            int [] steps = new int[n+1];

            if(n==0){
                return 0;
            }if(n==1){
                return 1;
            }if(n==2){
                return 2;
            }
                steps[0]= 0;
                steps [1] = 1;
                steps [2] = 2;
            for(int i=3;i<n+1;i++){
               steps[i]= steps[i-1]+ steps[i-2];
            }
            return steps[n];
        }

    static int minCostClimbingStairs(int[] cost) {
        int one = cost[cost.length-1];
        int two = cost[cost.length-2];
        int sum;
        if (one<two){
            sum=one;
        }sum = two;
        for (int i=cost.length-3; i>=0; i--){
            if(cost[i]+one<cost[i]+two){
                sum=cost[i]+one;
            }else{
                sum=cost[i]+two;
            }
            one=two;
            two=sum;
        }if (one<two){
            return one;
        }else{
            return two;
        }
    }

}

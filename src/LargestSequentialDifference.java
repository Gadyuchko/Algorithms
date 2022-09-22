public class LargestSequentialDifference {
    public static void main(String[] args) {
        int[] ints = {9,7,33,3,66,23,11};
        System.out.println(maxProfit(ints));
    }
    static int maxProfit(int[] prices) {
        int d = 0; // bestD
        int c = 0; // currentD
        int minP = prices[0];
        if(prices.length>1){
            for (int i = 0; i < prices.length; i++){
                if(prices[i]<minP){
                    minP=prices[i];
                }
                c=prices[i]-minP;
                if(c>d){
                    d=c;
                }
            }
        }return d;
    }

    static int maxProfit_2(int k, int[] prices) {
        int [] selected = new int [k*2];
        int currentP;
        if(prices.length>1){
            for (int i = 0; i < prices.length; i++){
//                if(prices[i]<selected[]){
//                    selected[selected.length/]=prices[i];
//                }
//                c=prices[i]-minP;
//                if(c>d){
//                    d=c;
//                }
            }
        }
        return 0;
    }
}

public class BinarySearch {

    static int search(int[] nums, int target) {
        int y= nums.length-1;
        int x=0;
        int index = -1;
        for(int i = x; i<=y; i++){
            if(target<nums[y/2]) y = y / 2;
            x=(y-i)/2;
            if(target == nums[i]) index=i;
        }return index;
    }

    static int firstBadVersion(int n) {
        int i = 1;
        int y= n;
        int first = n;
        int mid;
        while(i<=y){
            mid = i+(y-i)/2;
            if(isBadVersion(mid)){
                y=mid-1;
                first=mid;
            }else i=mid+1;
        }return first;
    }

    private static boolean isBadVersion(int mid) {
        return true;
    }

    static class SortedSearch {
        public static int countNumbers(int[] sortedArray, int lessThan) {
            int low = 0;
            int high = sortedArray.length-1;
            if (lessThan>sortedArray[sortedArray.length-1] || lessThan<=sortedArray[0])
                return 0;
            else
                while(high-low>1){
                    int mid = (high+low)/2;
                    if(sortedArray[mid]<lessThan)
                        low=mid+1;
                    else high=mid;
                }
                if(low==lessThan)
                    return low;
                else
                    return high;
        }

        public static void main(String[] args) {
            System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7, 8, 12, 22, 23, 25}, 28));
        }
    }

}

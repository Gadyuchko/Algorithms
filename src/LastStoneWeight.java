import java.util.Collections;
import java.util.PriorityQueue;

/*
You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together.
Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

If x == y, both stones are destroyed, and
If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
At the end of the game, there is at most one stone left.

Return the weight of the last remaining stone. If there are no stones left, return 0.
 */
public class LastStoneWeight {
    public static void main(String[] args) {
        int[] i1 = {1, 1, 3, 10, 12, 12};
        int[] i2 = {1};
        int[] i3 = {2,2,2,2};
        System.out.println(lastStoneWeight(i1));
        System.out.println(lastStoneWeight(i2));
        System.out.println(lastStoneWeight(i3));
    }

    static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(stones.length, Collections.reverseOrder());
        for(int i=0; i<stones.length; i++){
            max_heap.add(stones[i]);
        }
        while(max_heap.size()>1){
            int first = max_heap.remove();
            int second = max_heap.remove();

            if(first - second >0){
                max_heap.add(first-second);
            }
        }
        if(max_heap.size()<1){
            return 0;
        }else{
            return max_heap.remove();
        }
    }
}

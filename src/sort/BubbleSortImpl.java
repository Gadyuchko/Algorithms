package sort;

import java.util.Arrays;

/*
Simple sorting algorithm where we loop through array comparing index element(left) with next element(right)
and swap them if left is greater, at the end of loop we reduce right bound by 1 and repeat loop again
 */
public class BubbleSortImpl {
    public static int [] sort(int[] arr){
        // we provide variable for bound which has to be reduced with each loop run
        int bound = arr.length-1;

        // we start loop runs
        while (bound>0){

            // loop elements
            for (int i=0; i<bound; i++){

                // compare if left is greater then right
                if(arr[i]>arr[i+1]){

                    // we provide temp variable to store swap value
                    int swap = arr[i];

                    // perform swap
                    arr[i]=arr[i+1];
                    arr[i+1]=swap;
                }

                // check for end of loop and reduce bound
                if(i==bound-1){
                    bound--;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] test = {2,-12,4,0,345,7,-34,23,-5,7};
        System.out.println(Arrays.toString(sort(test)));
    }
}

package sort;

import java.util.Arrays;

/*
Simple sorting linear algorithm, technique is to start compare next element with previous elements for lowest,
if lower is next element swap with index save next position and keep comparing with previous in second loop untill lower found,
then continue with comparing next element from saved position repeating previous steps

we will need few additional variables to save indexes to swap and values of those indexes
 */
public class InsertionSortImpl {
    public static int [] sort(int ...arr){
        // we start looping over elements from second position
        for(int i =0; i< arr.length-1;i++){

            // additional variable for second loop pointing to next element
            int j = i+1;

            // temp variable to hold swapping value
            int temp;

            // now we can enter second loop in opposite direction to check if next element less than current
            while(j>0 && (arr[j-1] > arr[j])){

                // additional variable to hold swapping value
                temp = arr[j];

                // perform swap
                arr[j]=arr[j-1];
                arr[j-1] = temp;

                // and reduce bound for loop to check previous element
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] test = {2,-12,4,0,345,7,-34,23,-5,7};
        System.out.println(Arrays.toString(sort(test)));
    }
}

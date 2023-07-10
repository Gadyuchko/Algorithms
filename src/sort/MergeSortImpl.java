package sort;

import java.util.Arrays;

/*
More complex 'Divide and Conquer' sorting algorithm which divides provided array in half recursively till minimum of size 1,
and then merges two divided arrays in sorted order into initial array comparing leftmost elements of 2 sub arrays and inserting
the smallest untill one of them is empty, then adding rest of second
 */
public class MergeSortImpl {
    public static void sort(int[] arr , int left, int right){
        // we set up bound for recursive division
        // checking if left bound of array less than right to continue splitting
        if (left>=right) {
            return;
        }
        // we find middle element
            int middle = (left+right)/ 2;
        // start process of recursive splitting
            sort(arr, left, middle);
            sort(arr, middle+1, right);
        // once array is small enough we merge this array into our initial array in sorted order
        // starting from left most subarray and moving onto right returning from recursive backwards
            merge(arr,left, middle, right);

    }

    public static void merge(int[] arr, int left, int middle, int right){

        // we create 2 sub arrays to hold our split values
        int[] arrL = new int[middle + 1 - left];
        int[] arrR = new int[right - middle];

        //next we populate these arrays with values from initial array for further sorting
        for(int k=0; k<arrL.length; k++){
           arrL[k] = arr[left+k];
        }
        for(int l =0; l< arrR.length; l++){
            arrR[l]=arr[middle+1+l];
        }

        // provision of few pointer variables
        // i for left sub array
        // j for right sub array
        // a is a pointer for initial array, which starts from left most element passed
        int i = 0;
        int j = 0;
        int a = left;

        // next we check if both arrays are not empty
        while (i<arrL.length && j<arrR.length){

            // then we compare left and right array leftmost element and insert it into initial array
            if(arrL[i]<arrR[j]){
                arr[a]=arrL[i];
                 //move left array pointer
                i++;
            } else {
                arr[a] = arrR[j];
                // move right array pointer
                j++;
            }
            // move initial array pointer
            a++;
        }

        // one of the array becomes empty and we exit loop
        // now we check if left array has any elements by checking if pointer within bounds of left array
        while (i< arrL.length){

            // we insert remaining elements of left array into initial array
            arr[a]=arrL[i];

            // move pointers
            i++;
            a++;
        }
        // now we check if right array has any elements by checking if pointer within bounds of right array
        while (j< arrR.length){
            // we insert remaining elements of right array into initial array
            arr[a] = arrR[j];

            // move pointers
            j++;
            a++;
        }
    }

    public static void main(String[] args) {
        int [] test = {2,-12,4,0,345,7,-34,23,-5,7};
        sort(test,0, test.length-1);
        System.out.println(Arrays.toString(test));
     }
}

package sort;

import java.util.Arrays;

/*
More complex 'Divide and Conquer' array sorting algorithm that uses pivot element to partition array in 2 parts,
one for smaller elements and another for larger elements than pivot, and then using same steps recursively on split sub arrays
 */
public class QuickSortImpl {
    public static void sort(int [] arr, int l, int r){
        // we allocate var for index to partition around which will be returned by partition function
        int p = partition(arr, l , r);

        // now we recursively apply same steps to left sub array from partition index

        if(l<p){
            sort(arr,l,p-1);
        }


        //then we recursively apply same steps to left sub array from partition index
        if(r>p){
            sort(arr,p+1,r);
        }


    }

    public static int partition(int [] arr, int l, int r){
        // we store right most element as a pivot
        int pivot = arr[r];

        // and we need a variable to store the smaller element which will be partition index
        int j= l-1;
        // now we start looping through elements comparing with stored value from left to right to find smaller then pivot
       for(int i = l;i<r;i++){

           // we found smaller than pivot
            if(arr[i]<pivot){

                // we move the partition index to next position since it will be filled with smaller than pivot we found just now
                j++;

                // perform swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        // we looped through all array and found partition index, left of it (and partition index value) elements are lower than pivot, right of it greater
        // place pivot in right position by swapping values at found index+1 with right index value since pivot is greater than partition index we found

        arr[r]=arr[j+1];
        arr[j+1]=pivot;
        return j+1;
        }

    public static void main(String[] args) {
        int [] test = {2,-12,4,0,345,7,-34,23,-5,7};
        sort(test,0, test.length-1);
        System.out.println(Arrays.toString(test));
    }
}

package sort;

import java.util.Arrays;

/*
Simple linear algorithm which swaps pivot position with the lowest element in array
we will need additional variables to store the lowest position index and value
 */
public class SelectionSortImpl {
    public static int [] sort(int ... arr) {

        // now we loop through arr moving pivot to next position in array
        for (int i = 0; i < arr.length; i++) {

            // assign additional variables for value and index of element to swap and init them at starting position
            int lowest = arr[i];
            int swap = i;

            // next we check for each iteration if there is smaller number than pivot by looping through rest of array starting from pivot next element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < lowest) {

                    // found lowest and save it to variables position and value
                    lowest=arr[j];
                    swap = j;
                    }
                }

            //now we need to save the lowest number position value in temp var
            int temp = arr[swap];

            // now swap values of our pivot index with lowest value position
            arr[swap] = arr[i];
            arr[i] = temp;

            }
        return arr;
        }

        public static void main(String[] args) {
            int [] test = {2,-12,4,0,345,7,-34,23};
            System.out.println(Arrays.toString(sort(test)));
        }
    }

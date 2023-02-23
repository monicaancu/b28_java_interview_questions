package question17;

import java.util.Arrays;

public class SortAscendingArray {

    public static void main(String[] args) {

        int[] arr = {18, 4, -67 ,545, 0, 12, 7, 44, -56};

        System.out.println(Arrays.toString(Sort_Ascending_Array(arr)));

    }

    public static int [] Sort_Ascending_Array(int[]arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                int tmp = 0;

                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }

        return arr;
    }
}

package question15;

public class FindMaxNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6};
        findMaxNumber(arr);


    }


    public static void findMaxNumber(int array[]) {
        int maxNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        System.out.println("Maximum Number is  = " + maxNumber);
    }
}



/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */
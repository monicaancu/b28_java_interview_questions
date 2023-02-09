package question16;

//Write a method that can return the sum of the digits in a string

import java.util.Arrays;

public class SumOfDigitsInString {

    public static void main(String[] args) {
        String str = "20387";
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(sumOfDigitsInString1(str));
        System.out.println(sumOfDigitsInString2(str));

    }

    //method 1
    public static int sumOfDigitsInString1(String str){
        int sum = 0;

        //put string in char array
        char[] arr = str.toCharArray();

        //loop through array to check for digits
        for (char c : arr) {
            if (Character.isDigit(c)) { //if digit found

                int a = Integer.parseInt("" + c); //convert char to int by parsing the string
                sum += a;
            }
        }

        return sum;
    }

    //method 2 - different way
    public static int sumOfDigitsInString2(String str){
        int sum = 0;

        String numbers = "";
        //1. loop through string to find digits and put them in String numbers
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                numbers += ""+str.charAt(i);
            }
        }

        //2. convert String numbers into i
        // nt
        int a = Integer.parseInt(numbers);

        //3. calculate sum of digits
        int remainder;
        while(a>0){
           remainder = a%10;
           sum += remainder;
           a = a/10;
        }
        return sum;
    }

}

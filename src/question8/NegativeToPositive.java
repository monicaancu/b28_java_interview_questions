package question8;

public class NegativeToPositive {

    public static void main(String[] args) {

        int num = -125;

        System.out.println(reverseNeg(num));
    }



    public static int reverseNeg (int n) {

        int reversedNum = 0;
        int posNum = 0;


        if(n < 0 ) {

            for (int i = 0; i > n; i--) {
                posNum++;
            }

           while(posNum != 0){

               int lastDigit = posNum%10;

               reversedNum = reversedNum * 10 + lastDigit;

               posNum /= 10;

           }

        }

        return reversedNum;
    }





}

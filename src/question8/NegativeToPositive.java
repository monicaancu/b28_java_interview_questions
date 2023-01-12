package question8;

public class NegativeToPositive {

    public static void main(String[] args) {


        int negNum = -12;

       /* int a = -212;

        a = Math.abs(a);

        System.out.println(a);

        */

        System.out.println(negToPos(negNum));
    }

    public static int negToPos(int n) {
        int posNum = 0;

        for (int i = 0; i > n; i--) {
            posNum++;
        }

        return posNum;
    }

}

package question4;

public class SwapNumbers {

    public static void main(String[] args) {

        int x = 8;
        int y = 2;

        //we store the addition of both into 1st variable
        x = x + y; // 10

        //2nd variable: addition - 2nd variable
        y = x - y; // 8

        //1st variable: addition - 1st variable
        x = x - y; // 2

        System.out.println("x = " + x);
        System.out.println("y = " + y);




    }
}

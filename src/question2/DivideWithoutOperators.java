package question2;

public class DivideWithoutOperators {

    public static void main(String[] args) {
        int result = divide(10,-2);
        System.out.println(result);
    }

    public static int divide(int a, int b){
        //stop if b==0
        if(b==0){
            System.out.println("Can't divide by zero");
            System.exit(-1);
        }

        //store the sign
        int sign = 1;
        if(a * b <0){
            sign = -1;
        }
        //convert numbers to positive
        a = Math.abs(a);
        b = Math.abs(b);

        //initialize result at zero
        int result = 0;

        //loop till a becomes less than b
        while (a >= b){
            a = a - b;
            result++;
        }

        return result * sign;

    }

}

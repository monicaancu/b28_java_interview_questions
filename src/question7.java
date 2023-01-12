package src;

public class question7 {

    public static void main(String[] args) {

        /*
        7. Numbers -- Prime NumberWrite a method that can check if a number is prime or not
         */


                int num = 31;
                boolean primeNum = false;
                for (int i = 2; i <= num / 2; ++i) {
                    if (num % i == 0) {
                        primeNum = true;
                        break;
                    }
                }

                if (!primeNum)
                    System.out.println(num + " is a prime number.");
                else
                    System.out.println(num + " is not a prime number.");


    }
}

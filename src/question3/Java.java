package question3;

public class Java {

    public static void main(String[] args) {

        int num = 100;
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Divisible by 15 " + " \n");
            } else if (i % 5 == 0 && i % 15 != 0) {
                System.out.println(i + " Divisible by 5");
            } else {
                System.out.print("");
            }

        }
    }

}


package question12;

public class FindUnique {

    public static void main(String[] args) {


        String str = "AAABBBCCCDEF";

        System.out.println(findUnique(str));


    }


    public static String findUnique(String str){

        String result = "";

        for (int k = 0; k < str.length(); k++) {

            int count = 0;

            char ch = str.charAt(k);

            for (int i = 0; i < str.length(); i++) {

                if(str.charAt(i) == ch){
                    count++;
                }

            }

            if(count == 1){

                result += ch + "";

            }

        }

        return result;

    }
}

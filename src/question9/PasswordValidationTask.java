package question9;

public class PasswordValidationTask {

    public static void main(String[] args) {

        System.out.println(isValidPassword("pon ponop"));

    }

    public static boolean isValidPassword ( String password ) {
        //1. Password MUST be at least have 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        //2. PassWord should at least contain one upper case letter
        boolean itHasUpperCase = false;
        //3. PassWord should at least contain one lowercase letter
        boolean itHasLowerCase = false;
        //4. Password should at least contain one special characters
        boolean itHasSpecialCharacter = false;
        //5. Password should at least contain a digit
        boolean itHasDigit = false;
        //setting to false as default ↑

        for (int i = 0; i < password.length(); i++) {
            //each character
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                itHasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                itHasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                itHasDigit = true;
            } else {
                itHasSpecialCharacter = true;
            }
        }

        // Otherwise
        // This returns false for all the requirements not met above ↑
        return itHasUpperCase && itHasLowerCase && itHasSpecialCharacter && itHasDigit;
    }
    //This method takes a password string as an input, and returns true if the password is valid, and false otherwise. The method first checks if the password is at least 6 characters long and doesn't contain spaces. Then, it loops through each character in the password, and uses the Character class's methods to check if the character is an upper-case letter, lower-case letter, digit, or a special character. If the password has at least one of each type of character, the method returns true.





}

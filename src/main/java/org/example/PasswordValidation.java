package org.example;

public class PasswordValidation {


    public static boolean passwordLengthValidation(String password) {
//        while (password.contains("password123") ||password.contains("0123456789")){
//            System.out.println("Password to insecure. Enter new password");
//            break;
//        }
        return password.length() >= 8;
    }


    public static boolean passwordContainsNumbers(String password) {

        return password.matches(".*\\d.*");
    }
}

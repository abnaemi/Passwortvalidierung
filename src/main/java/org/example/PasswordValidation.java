package org.example;

public class PasswordValidation {


    public static boolean passwordLengthValidation(String password) {

        return password.length() >= 8;
    }


    public static boolean passwordContainsNumbers(String password) {

        return password.matches(".*\\d.*");
    }
}

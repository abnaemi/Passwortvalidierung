package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password");
        String password = scanner.nextLine();

        do {
            if (password.contains("password123") || password.contains("123456789")) {
                System.out.println("Password to insecure. Enter new password");
                String passwordinsecure = scanner.nextLine();
                password = passwordinsecure;

            } else if (!PasswordValidation.passwordLengthValidation(password)
                    || !PasswordValidation.passwordContainsNumbers(password)
                    || !PasswordValidation.checkLowerUpperCase(password)) {
                System.out.println("Password must contain upper and lower case letters, a number and at least 9 characters. Enter a new password");
                String password2 = scanner.nextLine();
                password = password2;
            }

        } while (!PasswordValidation.passwordLengthValidation(password)
                || !PasswordValidation.passwordContainsNumbers(password) || password.contains("password123")
                || password.contains("0123456789") || !PasswordValidation.checkLowerUpperCase(password));
        System.out.println("Password accepted");
    }
}

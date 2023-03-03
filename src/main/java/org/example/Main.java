package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        //System.out.println("Your password is " + password);

        do {
            if (password.contains("password123") || password.contains("0123456789")) {
                System.out.println("Password to insecure. Enter new password");
                String passwordinsecure = scanner.nextLine();
                password =passwordinsecure;

            } else if (PasswordValidation.passwordLengthValidation(password)
                    && PasswordValidation.passwordContainsNumbers(password)) {
                System.out.println("Password accepted!");
            } else if (!PasswordValidation.passwordLengthValidation(password) || !PasswordValidation.passwordContainsNumbers(password)) {
                System.out.println("Password too short or doesnt contain numbers. Enter a new password");
                String password2 = scanner.nextLine();
                password = password2;

            }

            //System.out.println(PasswordValidation.passwordLengthValidation(password));
            //System.out.println(PasswordValidation.passwordContainsNumbers(password));

        } while (!PasswordValidation.passwordLengthValidation(password)
                || !PasswordValidation.passwordContainsNumbers(password) || password.contains("password123") || password.contains("0123456789"));


    }
}


//    Scanner input = new Scanner (System.in);
//        System.out.println("Gib dein Passwort ein");
//
//                String passwort = input.nextLine();
//
//                System.out.println(passwort.length() );
//


//                if (passwort.matches(".*\\d.*"))
//                {System.out.println("contains a number");}
//                else {
//                System.out.println("no number");
//                }
//
//                if (passwort.contains("123456" || "passwort")) {
//                return "weak passwort"
//                }  else
//                return "good passwort"
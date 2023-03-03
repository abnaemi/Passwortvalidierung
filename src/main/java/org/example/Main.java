package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        //System.out.println("Your password is " + password);
        if (PasswordValidation.passwordLengthValidation(password)
                && PasswordValidation.passwordContainsNumbers(password)) {
            System.out.println("Password accepted!");
        } else if (!PasswordValidation.passwordLengthValidation(password)) {
            System.out.println("Password too short. Enter new password" );
        } else if (!PasswordValidation.passwordContainsNumbers(password)) {
            System.out.println("Password doesn't contain numbers. Enter new password");
        }


        //System.out.println(PasswordValidation.passwordLengthValidation(password));
        //System.out.println(PasswordValidation.passwordContainsNumbers(password));

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
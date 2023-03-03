package org.example;

public class PasswordValidation {


    public static boolean passwordLengthValidation(String password) {

        return password.length() >= 8;
    }


    public static boolean passwordContainsNumbers(String password) {

        return password.matches(".*\\d.*");
    }



    /*
    *
    *
    * checkstring methode von stackoveflow
    * erklärung = System.out.println(checkString("aBCd1")); // output is true
    *   System.out.println(checkString("abcd")); //output is false
    * */
    public static boolean checkString(String str) {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            if(numberFlag && capitalFlag && lowerCaseFlag)
                return true;
        }
        return false;
    }
}

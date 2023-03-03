package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordValidationTest {
    @Test
    void isPasswordLongEnoughTrue() {


        // GIVEN

        String password = "firstproject";

        //WHEN

        boolean actual = PasswordValidation.passwordLengthValidation(password);

        // THEN
        assertEquals(true, actual);


    }

    @Test
    void isPasswortLongFalse() {
        // GIVEN
        String password = "first a";

        //WHEN
        boolean actual = PasswordValidation.passwordLengthValidation(password);

        // THEN
        assertEquals(false, actual);


    }
    @Test
    void isPasswordEqual() {
        // GIVEN
        String password = "first aa";

        //WHEN
        boolean actual = PasswordValidation.passwordLengthValidation(password);

        // THEN
        assertEquals(true, actual);


    }

    @Test
    void containsNumbersTrue() {
        // GIVEN
        String password = "first8";

        //WHEN
        boolean actual = PasswordValidation.passwordContainsNumbers(password);

        // THEN
        assertEquals(true, actual);


    }

    @Test
    void containsNumbersFalse() {
        // GIVEN
        String password = "first";

        //WHEN
        boolean actual = PasswordValidation.passwordContainsNumbers(password);

        // THEN
        assertEquals(false, actual);


    }

}
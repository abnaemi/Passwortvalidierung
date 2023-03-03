package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordValidationTest {
    @Test
    void isPasswortLongEnough(){


        // GIVEN

        String password = "firstproject";

        //WHEN

        boolean actual = PasswordValidation.passwordLengthValidation(password);

        // THEN
        assertEquals(true, actual);


    }




}
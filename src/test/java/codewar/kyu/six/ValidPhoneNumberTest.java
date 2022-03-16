package codewar.kyu.six;

import codewar.kyu.six.ValidPhoneNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidPhoneNumberTest {

    @org.junit.jupiter.api.Test
    void validPhoneNumber() {
        assertEquals(true, ValidPhoneNumber.validPhoneNumber("(123) 456-7890"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(1111)555 2345"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(098) 123 4567"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(098a) 123-4567"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("a(098) 123-4567"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(098) 123-4567a"));
        assertEquals(false, ValidPhoneNumber.validPhoneNumber("(098) 121*-4567"));
    }
}

package person.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonValidationTest {
    PersonValidation personValidation;

    @BeforeEach
    void setUp() {
        personValidation=new PersonValidation();
    }


    @Test
    void validateAadhar() {
        assertTrue(personValidation.validateAadhar(123456789123L));
        assertFalse(personValidation.validateAadhar(12345678922222222L));
        assertFalse(personValidation.validateAadhar(123445555L));
    }
    @Test
    void validateAge(){
        assertTrue(personValidation.validateAge("21"));
        assertFalse(personValidation.validateAge("2"));
        assertTrue(personValidation.validateAge("18"));
        assertTrue(personValidation.validateAge("60"));
    }
}
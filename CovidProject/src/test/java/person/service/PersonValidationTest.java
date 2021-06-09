package person.service;

import database.DatabaseInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonValidationTest{
    PersonValidation personValidation;

    @BeforeEach
    void setUp() {
        personValidation=new PersonValidation();
        DatabaseInterface.person_details.put(123456781234L,new ArrayList<>());
        DatabaseInterface.person_details.get(123456781234L).add("bhavya");
        DatabaseInterface.person_details.get(123456781234L).add("21");
        DatabaseInterface.person_details.get(123456781234L).add("2021-06-07");
        DatabaseInterface.person_details.get(123456781234L).add("2021-06-07");
    }

    @Test
    void containsAadhar(){
        assertFalse(personValidation.containsAadhar(123456781235L));
        assertTrue(personValidation.containsAadhar(123456781234L));
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
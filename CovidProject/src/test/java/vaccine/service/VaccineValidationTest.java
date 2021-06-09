package vaccine.service;

import model.Pojo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VaccineValidationTest {
    VaccineValidation vaccineValidation;


    @BeforeEach
    void setUp() {
        vaccineValidation=new VaccineValidation();
    }

    @Test
    void noStock() {
        assertTrue(vaccineValidation.NoStock());
    }

    @Test
    void checkStock() {
        Pojo.total_dose=20;
        assertTrue(vaccineValidation.checkStock());
    }
    @Test
    void checkStock1() {
        Pojo.total_dose=0;
        assertFalse(vaccineValidation.checkStock());
    }
}
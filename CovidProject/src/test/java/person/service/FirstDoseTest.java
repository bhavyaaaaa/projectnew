package person.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstDoseTest {
    FirstDose firstDose;
    @BeforeEach
    void setUp() {
        firstDose=new FirstDose();
    }

    @Test
    void dose() {
        assertEquals("First Dose Finished",firstDose.dose(123456781334L,"bhavya","21"));
        assertEquals("Aadhar already Exists: Person Not Added",firstDose.dose(123456781234L,"bhavya","21"));
    }

}
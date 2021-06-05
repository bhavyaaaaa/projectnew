package person.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondDoseTest {

    @Test
    void dose() {
    SecondDose secondDose=new SecondDose();
    assertEquals("Not Eligible for Second Dose",secondDose.dose(123456782342L,"bhavya","21"));
    //assertEquals("Eligible for Second dose: Dose finished: Fully Vaccinated\n",secondDose.dose(123456782342L,"bhavya","21"));
    }

}
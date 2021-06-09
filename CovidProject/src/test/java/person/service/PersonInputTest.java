package person.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SuppressWarnings("ALL")
class PersonInputTest {

    @Test
    void singleDose() {
        //noinspection InstantiationOfUtilityClass
        PersonInput personInput=new PersonInput();
        assertFalse(PersonInput.singleDose(1, 123456781234L, "bhavya", "21"));
        //assertEquals(false,personInput.singleDose(1,123456781234L,"bhavya","21"));
    }
}
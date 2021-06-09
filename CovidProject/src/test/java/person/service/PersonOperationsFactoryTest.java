package person.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonOperationsFactoryTest {

    @Test
    void getInstance() {
        new FirstDose();
        assertTrue(PersonOperationsFactory.person_operations.get(1) instanceof FirstDose);
        new SecondDose();
        assertTrue(PersonOperationsFactory.person_operations.get(2) instanceof SecondDose);
    }
}
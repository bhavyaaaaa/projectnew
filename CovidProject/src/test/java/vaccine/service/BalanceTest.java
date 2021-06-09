package vaccine.service;

import org.junit.jupiter.api.Test;

import model.Pojo;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void balance() {
        Pojo.total_dose=20;
        @SuppressWarnings("unused") Balance balance=new Balance();
        assertEquals(20, Balance.balance());
    }
}
package vaccine.service;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class StockHistoryTest {
    final HashMap<LocalDate, Integer> vaccine_history= new HashMap<>();
    final String result=("Stock History:[Date:Stock Number] \n "+ vaccine_history);


    @SuppressWarnings("unused")
    @Test
    void checkVaccineHistory() {
        StockHistory stockHistory=new StockHistory();
        assertEquals(result, StockHistory.checkVaccineHistory());
    }
}
package vaccine.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddVaccineStockTest {

    @Test
    void addStock() {
        AddVaccineStock addVaccineStock=new AddVaccineStock();
        assertEquals("Stock Added",addVaccineStock.addStock(20));
        assertEquals("Stock Added",addVaccineStock.addStock(2000000000));
    }
}
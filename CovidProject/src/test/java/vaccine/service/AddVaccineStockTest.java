package vaccine.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddVaccineStockTest {

    @SuppressWarnings("unused")
    @Test
    void addStock() {
        AddVaccineStock addVaccineStock=new AddVaccineStock();
        assertEquals("Stock Added", AddVaccineStock.addStock(20));
        assertEquals("Stock Added", AddVaccineStock.addStock(2000000000));
    }
}
package dao;


import java.time.LocalDate;
import java.util.Map;

public interface Vaccine {
    void addStock(int stock);
    int balance();
    Map<LocalDate, Integer> checkVaccineHistory();
}

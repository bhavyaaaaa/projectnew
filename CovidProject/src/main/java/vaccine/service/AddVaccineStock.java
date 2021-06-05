package vaccine.service;

import model.Pojo;
import java.time.LocalDate;

public class AddVaccineStock extends Pojo {
    public static String addStock(int stock) {
        total_dose+=stock;
        if(vaccine_history.containsKey(LocalDate.now())){
            int old=vaccine_history.get(LocalDate.now());
            vaccine_history.replace(LocalDate.now(),stock+old);
        }
        else vaccine_history.put(LocalDate.now(),stock);
        return "Stock Added";
    }

}

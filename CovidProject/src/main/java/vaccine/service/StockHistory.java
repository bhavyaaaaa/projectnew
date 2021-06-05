package vaccine.service;

import database.DatabaseInterface;

public class StockHistory extends DatabaseInterface {

    public static String checkVaccineHistory(){
        return ("Stock History:[Date:Stock Number] \n " + vaccine_history);
    }
}

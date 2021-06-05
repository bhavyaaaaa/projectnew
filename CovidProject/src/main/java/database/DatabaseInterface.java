package database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DatabaseInterface {
    public static Map<Long, ArrayList<String>> person_details = new HashMap<>();
    public static HashMap<LocalDate, Integer> vaccine_history= new HashMap<>();
}


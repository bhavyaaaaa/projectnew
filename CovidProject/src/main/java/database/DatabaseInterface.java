package database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DatabaseInterface {
    public static final Map<Long, ArrayList<String>> person_details = new HashMap<>();
    public static final HashMap<LocalDate, Integer> vaccine_history= new HashMap<>();
}


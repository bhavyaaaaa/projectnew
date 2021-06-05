package vaccine.service;

import java.util.HashMap;

public class VaccineOperationsFactory {
        HashMap<Integer, Object> vaccine_operations = new HashMap<>() {{
        put(3, new Balance());
        put(4, new AddVaccineStock());
        put(5, new StockHistory());
    }};

    public Object getInstance(int input) {
        return vaccine_operations.get(input);
    }
}

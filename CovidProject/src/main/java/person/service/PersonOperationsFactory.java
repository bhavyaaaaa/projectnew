package person.service;

import dao.Person;
import java.util.HashMap;
import java.util.Map;


public class PersonOperationsFactory {
    Map<Integer, Person> person_operations = new HashMap<>() {{
        put(1, new FirstDose());
        put(2, new SecondDose());
    }};
    public Person getInstance(int input) {
        return person_operations.get(input);
    }

}

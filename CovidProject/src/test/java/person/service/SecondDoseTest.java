package person.service;

import database.DatabaseInterface;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondDoseTest {
    SecondDose secondDose;
    long difference1;

    @Test
    void dose() {
        secondDose = new SecondDose();
        LocalDate date=LocalDate.now();
        DatabaseInterface.person_details.put(133456781234L, new ArrayList<>());
        DatabaseInterface.person_details.get(133456781234L).add("Bhavya");
        DatabaseInterface.person_details.get(133456781234L).add("21");
        DatabaseInterface.person_details.get(133456781234L).add(String.valueOf(date));
        DatabaseInterface.person_details.get(133456781234L).add("2021-06-30");

        DatabaseInterface.person_details.put(223456781234L, new ArrayList<>());
        DatabaseInterface.person_details.get(223456781234L).add("Bhav");
        DatabaseInterface.person_details.get(223456781234L).add("21");
        DatabaseInterface.person_details.get(223456781234L).add(String.valueOf(date));
        DatabaseInterface.person_details.get(223456781234L).add("2021-06-18");

        DatabaseInterface.person_details.put(323456781234L, new ArrayList<>());
        DatabaseInterface.person_details.get(323456781234L).add("Bha");
        DatabaseInterface.person_details.get(323456781234L).add("21");
        DatabaseInterface.person_details.get(323456781234L).add(String.valueOf(date));
        DatabaseInterface.person_details.get(323456781234L).add("2021-07-05");

        difference1= ChronoUnit.DAYS.between(LocalDate.parse((DatabaseInterface.person_details.get(223456781234L)).get(2)),LocalDate.parse((DatabaseInterface.person_details.get(223456781234L)).get(3)));
        assertEquals("Eligible for Second dose: Dose finished: Fully Vaccinated\n", secondDose.dose(133456781234L, "Bhavya", "21"));
        assertEquals("Comeback After: " + (21 - (difference1+1)) + " days \n", secondDose.dose(223456781234L, "Bhav", "21"));
        assertEquals("Date Exceeded or You have come for third dose \n", secondDose.dose(323456781234L, "Bha", "21"));
    }
}
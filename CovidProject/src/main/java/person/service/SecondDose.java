package person.service;

import dao.Person;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import vaccine.service.Balance;

import java.time.LocalDate;
import java.time.Period;

import static database.DatabaseInterface.person_details;

;


public class SecondDose implements Person {
    private static final Logger logger = LogManager.getLogger(SecondDose.class);
    String result="Not Eligible for Second Dose";
    @Override
    public String dose(Long aadhar, String name, String age) {
        BasicConfigurator.configure();
        Period difference = Period.between(LocalDate.now(), LocalDate.parse(person_details.get(aadhar).get(3)));
        if (difference.getDays() == 21) {
           result="Eligible for Second dose: Dose finished: Fully Vaccinated\n";
           Balance.total_dose--;
           person_details.get(aadhar).get(3).replace(person_details.get(aadhar).get(3), LocalDate.now().toString());
        }
        else differenceDate(difference);
        return result;
    }

    private void differenceDate(Period difference) {
        BasicConfigurator.configure();
        if (difference.getDays() < 21)
            logger.fatal("Comeback After: " + (21 - difference.getDays()) + " days \n");
        else
            logger.error("Date Exceeded or You have come for third dose \n");
    }


}

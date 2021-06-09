package person.service;

import dao.Person;
import database.DatabaseInterface;
import vaccine.service.Balance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static database.DatabaseInterface.person_details;

public class SecondDose implements Person {
    String result="";

    @Override
    public String dose(long aadhar, String name, String age) {
        //Period difference = Period.between(LocalDate.now(), LocalDate.parse(DatabaseInterface.person_details.get(aadhar).get(3)));
        List<String> details = (DatabaseInterface.person_details.get(aadhar));
        String past=details.get(3);
        long difference = ChronoUnit.DAYS.between(LocalDate.now(),LocalDate.parse(past));
        result=differenceDate(aadhar,difference);
        return result;
    }

    private String differenceDate(Long aadhar,long difference) {

        if (difference == 21) {
            result="Eligible for Second dose: Dose finished: Fully Vaccinated\n";
            Balance.total_dose--;
            person_details.get(aadhar).get(3).replace(person_details.get(aadhar).get(3), LocalDate.now().toString());
        }
        else if (difference < 21){
            result= ("Comeback After: " + (21 - (difference+1)) + " days \n");}
        else
            result= ("Date Exceeded or You have come for third dose \n");
        return result;
    }


}

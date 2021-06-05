package person.service;

import dao.Person;
import vaccine.service.Balance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static database.DatabaseInterface.person_details;


public class FirstDose implements Person {

    PersonValidation isvalid = new PersonValidation();
    String result="First Dose Finished";
    @Override
    public String dose(Long aadhar, String name, String age){
        if (isvalid.containsAadhar(aadhar))
            result="Aadhar already Exists: Person Not Added";
        else {
            singlePerson(aadhar,name,age);
        }
        return result;
    }
    public void singlePerson(Long aadhar,String name, String age) {

        person_details.put(aadhar, new ArrayList<>(Arrays.asList(name, age, LocalDate.now().toString(),LocalDate.now().toString())));
        Balance.total_dose--;
    }

}

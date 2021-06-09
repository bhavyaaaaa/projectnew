package person.service;

import dao.Person;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import userinput.Input;
import vaccine.service.Balance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static database.DatabaseInterface.person_details;


public class FirstDose implements Person {

    final PersonValidation isvalid = new PersonValidation();
    String result="First Dose Finished";
    private Logger logger = LogManager.getLogger(Input.class);
    @Override
    public String dose(long aadhar, String name, String age){
        if (isvalid.containsAadhar(aadhar))
            result="Aadhar already Exists: Person Not Added";
        else {
            singlePerson(aadhar,name,age);
        }
        return result;
    }
    public void singlePerson(Long aadhar,String name, String age) {
        BasicConfigurator.configure();
        if (isvalid.validateAge(age)) {
            person_details.put(aadhar, new ArrayList<>(Arrays.asList(name, age, LocalDate.now().toString(), LocalDate.now().toString())));
            Balance.total_dose--;
        } else logger.info("Not the right age to get Vaccination");
    }
}

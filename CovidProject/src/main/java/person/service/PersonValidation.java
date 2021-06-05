package person.service;

import database.DatabaseInterface;

public class PersonValidation extends DatabaseInterface {
    public boolean containsAadhar(Long aadhar) {
        return (person_details.containsKey(aadhar));
    }
    public boolean validateAadhar(Long aadhar) {
        return (int)(Math.log10(aadhar) + 1) == 12;
    }
    public boolean validateAge(String age){ return (Integer.parseInt(age)>=18); }
}
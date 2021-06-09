package person.service;

import database.DatabaseInterface;
public class PersonValidation {
    public boolean containsAadhar(Long aadhar) {
        return (DatabaseInterface.person_details.containsKey(aadhar));
    }
    public boolean validateAadhar(Long aadhar) {
        return (int)(Math.log10(aadhar) + 1) == 12;
    }
    public boolean validateAge(String age){ return (Integer.parseInt(age)>=18); }
}
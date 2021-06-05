package person.service;
import dao.Person;
import vaccine.service.VaccineValidation;

;

public class PersonInput {

    public static void singleDose(int choice, Long aadhar, String name, String age) {
        final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(PersonInput.class);
        PersonValidation valid = new PersonValidation();
        VaccineValidation is=new VaccineValidation();
        PersonOperationsFactory person_factory = new PersonOperationsFactory();
        Person per = person_factory.getInstance(choice);
        if (valid.validateAadhar(aadhar)) {
            if(is.checkStock()) logger.info(per.dose(aadhar, name, age));
            else is.NoStock();
        }
        else{
            logger.fatal("Aadhar is not valid");
        }
    }
}

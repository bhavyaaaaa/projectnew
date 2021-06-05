package userinput;

import model.Pojo;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import person.service.PersonInput;
import vaccine.service.AddVaccineStock;
import vaccine.service.Balance;
import vaccine.service.StockHistory;
import java.util.Scanner;


public class Input extends Pojo {

    Scanner sc=new Scanner(System.in);
    private static final Logger logger = LogManager.getLogger(Input.class);
    public void enterYourChoice() {
        BasicConfigurator.configure();
        logger.info("Ready to get Vaccination!");
        while ( true ) {
            logger.info("\n Enter your Choice: \n 1) Getting First Dose(Add person) \n 2) Getting Second Dose \n 3) Check Vaccine Balance \n 4) Add Vaccine Stock \n 5) Check Stock History \n Enter any other number to Exit \n");
            int choice=sc.nextInt();
            switch (choice) {
                case 1,2 -> personDose(choice);
                case 3 -> logger.debug("Balance: " + Balance.balance());
                case 4 -> {
                    logger.info("Enter Stock:");
                    int stock=sc.nextInt();
                    setStock(stock);
                    logger.debug(AddVaccineStock.addStock(stock));
                }
                case 5 -> System.out.println(StockHistory.checkVaccineHistory());
                default -> logger.error("Your Choice is Invalid!");
            }
        }
    }
    public void personDose(int choice){
        logger.info("Enter Aadhar Number: 12 digits only");
        aadhar=sc.nextLong();
        setAadhar(aadhar);
        logger.info("Enter your Name: ");
        String name=sc.next();
        setName(name);
        logger.info("Enter your Age: Above 18 years only");
        String age=sc.next();
        setAge(age);
        PersonInput.singleDose(choice,aadhar,name,age);
        }
}

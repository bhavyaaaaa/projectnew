package application;

import exceptions.NoVaccineStockAvailableException;
import userinput.Input;

public class Client {
    public static void main(String[] args) throws NoVaccineStockAvailableException {
        Input yourChoice= new Input();
        yourChoice.enterYourChoice();
    }
}

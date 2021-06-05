package vaccine.service;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import static vaccine.service.Balance.total_dose;

;
;

public class VaccineValidation{

    private static final Logger logger = LogManager.getLogger(VaccineValidation.class);
    public boolean NoStock() {
        BasicConfigurator.configure();
        logger.fatal("No Stock Available(Person Not Added): Add Stock to Proceed ");
        return true;
    }
    public boolean checkStock() {
        return (total_dose >= 1);
    }

}

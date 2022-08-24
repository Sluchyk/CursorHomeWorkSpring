package annotationConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("calculators")
public class Calculator {
    private  MinusService minusService;
    private PlusService plusService;
    public  int calculate(int first,int second)
    {
        return  first>second?minusService.minusService(first,second):plusService.plusService(first,second);
    }

    public MinusService getMinusService() {
        return minusService;
    }
    @Autowired
    public void setMinusService(MinusService minusService) {
        this.minusService = minusService;
    }

    public PlusService getPlusService() {
        return plusService;
    }
    @Autowired
    public void setPlusService(PlusService plusService) {
        this.plusService = plusService;
    }
}

package javaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class Calculator {
    private  PlusService plusService;
    private  MinusService minusService;
    public  int calculate(int first,int second)
    {
        return  first>second?minusService.minusService(first,second):plusService.plusService(first,second);
    }

    public PlusService getPlusService() {
        return plusService;
    }
    public void setPlusService(PlusService plusService) {
        this.plusService = plusService;
    }

    public MinusService getMinusService() {
        return minusService;
    }
    public void setMinusService(MinusService minusService) {
        this.minusService = minusService;
    }
}

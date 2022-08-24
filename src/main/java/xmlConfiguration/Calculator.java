package xmlConfiguration;

public class Calculator {
    private PlusService plusService;
    private  MinusService minusService;
    public int calculate(int first,int second)
    {
        if(first>second)
            return minusService.minusService(first,second);
        else
            return  plusService.plusService(first,second);

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

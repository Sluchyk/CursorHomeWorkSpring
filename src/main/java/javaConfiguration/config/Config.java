package javaConfiguration.config;

import javaConfiguration.Calculator;
import javaConfiguration.MinusService;
import javaConfiguration.PlusService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public PlusService plusService()
    {
        return new PlusService();
    }
    @Bean
    public MinusService minusService()
    {
        return  new MinusService();
    }
    @Bean
    public Calculator calculator()
    {
        Calculator calculator=new Calculator();
        calculator.setMinusService(minusService());
        calculator.setPlusService(plusService());
        return  calculator;
    }

}

package annotationConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("annotationConfiguration");
        Calculator calculator= applicationContext.getBean("calculators",Calculator.class);
        System.out.println(calculator.calculate(4,3));
        System.out.println(calculator.calculate(3,4));
    }
}

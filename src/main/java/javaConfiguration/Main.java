package javaConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext("javaConfiguration/config");
        Calculator calculator =applicationContext.getBean(Calculator.class);
        System.out.println(calculator.calculate(4,5));
        System.out.println(calculator.calculate(5,4));

    }
}

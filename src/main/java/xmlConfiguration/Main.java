package xmlConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory =new ClassPathXmlApplicationContext("bean-factory.xml");
             Calculator calculator=beanFactory.getBean("calculator",Calculator.class);
        System.out.println(calculator.calculate(4,5));
        System.out.println(calculator.calculate(5,3));

    }
}

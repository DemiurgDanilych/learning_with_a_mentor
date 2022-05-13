package springcore.comparisonOfDependencyInjectionInSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcore.comparisonOfDependencyInjectionInSpring.city.City;

public class XMLConfiguredCity {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextCity.xml");
        City city = applicationContext.getBean(City.class);
        System.out.println(city);
    }
}

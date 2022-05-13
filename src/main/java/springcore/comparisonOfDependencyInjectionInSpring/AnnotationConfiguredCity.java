package springcore.comparisonOfDependencyInjectionInSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcore.comparisonOfDependencyInjectionInSpring.city.City;

public class AnnotationConfiguredCity {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext annotationContext = new ClassPathXmlApplicationContext("annotationContextCity.xml");
        City city = annotationContext.getBean(City.class);
        System.out.println(city);
    }
}

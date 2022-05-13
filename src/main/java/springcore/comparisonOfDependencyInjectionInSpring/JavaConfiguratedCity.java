package springcore.comparisonOfDependencyInjectionInSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springcore.comparisonOfDependencyInjectionInSpring.city.City;
import springcore.comparisonOfDependencyInjectionInSpring.city.ElectricitySystem;
import springcore.comparisonOfDependencyInjectionInSpring.city.IndustrialDistrict;
import springcore.comparisonOfDependencyInjectionInSpring.city.PipeLineSystem;

public class JavaConfiguratedCity {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(CityConfiguration.class);
        City city = annotationConfigApplicationContext.getBean(City.class);
        System.out.println(city);
    }
}

@Configuration
class CityConfiguration{
    @Bean
    public ElectricitySystem electricitySystem(){
        return new ElectricitySystem();
    }
    @Bean
    public PipeLineSystem pipeLineSystem(){
        return new PipeLineSystem();
    }
    @Bean
    public IndustrialDistrict industrialDistrict(){
        return new IndustrialDistrict();
    }

    @Bean
    public City city(PipeLineSystem pipeLineSystem, ElectricitySystem electricitySystem,IndustrialDistrict industrialDistrict){
        return new City(pipeLineSystem,electricitySystem,industrialDistrict);
    }

}

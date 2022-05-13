package springcore.comparisonOfDependencyInjectionInSpring;

import springcore.comparisonOfDependencyInjectionInSpring.city.City;
import springcore.comparisonOfDependencyInjectionInSpring.city.ElectricitySystem;
import springcore.comparisonOfDependencyInjectionInSpring.city.IndustrialDistrict;
import springcore.comparisonOfDependencyInjectionInSpring.city.PipeLineSystem;

public class TraditionalConfiguredCity {
    public static void main(String[] args) {
        ElectricitySystem electricitySystem = new ElectricitySystem();
        PipeLineSystem pipeLineSystem = new PipeLineSystem();
        IndustrialDistrict industrialDistrict = new IndustrialDistrict();


        City city = new City(pipeLineSystem, electricitySystem,industrialDistrict);

        System.out.println(city);
    }
}

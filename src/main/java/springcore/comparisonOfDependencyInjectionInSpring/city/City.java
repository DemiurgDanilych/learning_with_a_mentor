package springcore.comparisonOfDependencyInjectionInSpring.city;

public class City {
    private PipeLineSystem pipeLineSystem;
    private ElectricitySystem electricitySystem;
    private IndustrialDistrict industrialDistrict;

    public City( PipeLineSystem pipeLineSystem,
                 ElectricitySystem electricitySystem,
                 IndustrialDistrict industrialDistrict) {
        this.pipeLineSystem = pipeLineSystem;
        this.electricitySystem = electricitySystem;
        this.industrialDistrict = industrialDistrict;
    }

    @Override
    public String toString() {
        return "City{" +
                "pipeLineSystem=" + pipeLineSystem +
                ", electricitySystem=" + electricitySystem +
                ", industrialDistrict=" + industrialDistrict +
                '}';
    }
}

package springcore;

public class DecisionMaker {

    private WeatherForecastProvider weatherForecastProvider;

    public DecisionMaker(WeatherForecastProvider weatherForecastProvider) {
        this.weatherForecastProvider = weatherForecastProvider;
    }

    public void makeDecision()
    {
        boolean isGoodWeather = weatherForecastProvider.getWeather();
        if(isGoodWeather) {
            System.out.println("Go play football!");
        }
        else {
            System.out.println("Stay at hone, learn Java!");
        }
    }
}

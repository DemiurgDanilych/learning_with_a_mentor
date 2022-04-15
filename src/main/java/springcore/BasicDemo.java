package springcore;

public class BasicDemo {

    public static void main(String[] args) {

//        WeatherForecastProvider forecastProvider = new GoodWeatherForecastProvider();
        WeatherForecastProvider forecastProvider = new BadWeatherForecastProvider();
        DecisionMaker dm = new DecisionMaker(forecastProvider);
        dm.makeDecision();
    }
}

package springcore;

public class GoodWeatherForecastProvider implements WeatherForecastProvider {

    @Override
    public boolean getWeather() {
        System.out.println("Weather is good!");
        return true;
    }
}

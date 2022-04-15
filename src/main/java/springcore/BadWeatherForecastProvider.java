package springcore;

public class BadWeatherForecastProvider implements WeatherForecastProvider {
    @Override
    public boolean getWeather() {
        System.out.println("Heavy rain!");
        return false;
    }
}

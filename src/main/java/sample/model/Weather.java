package sample.model;



/**
 * Created by Andrzej on 17.11.2016.
 */
public class Weather {

    private double temperatureInCelsius;
    private String lastUpdated;
    private double temperatureFeelsInCelsius;
    private boolean isDay;
    private double pressureMb;
    private String location;
    private WeatherCondition weatherCondition;


    public Weather(double temperatureInCelsius, String lastUpdated, double temperatureFeelsInCelsius, boolean isDay, double pressureMb, String location, WeatherCondition weatherCondition) {
        this.temperatureInCelsius = temperatureInCelsius;
        this.lastUpdated = lastUpdated;
        this.temperatureFeelsInCelsius = temperatureFeelsInCelsius;
        this.isDay = isDay;
        this.pressureMb = pressureMb;
        this.location = location;
        this.weatherCondition = weatherCondition;
    }

    public Weather(){}

    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getTemperatureFeelsInCelsius() {
        return temperatureFeelsInCelsius;
    }

    public void setTemperatureFeelsInCelsius(double temperatureFeelsInCelsius) {
        this.temperatureFeelsInCelsius = temperatureFeelsInCelsius;
    }

    public boolean isDay() {
        return isDay;
    }

    public void setDay(boolean day) {
        isDay = day;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperatureInCelsius=" + temperatureInCelsius +
                ", lastUpdated=" + lastUpdated +
                ", temperatureFeelsInCelsius=" + temperatureFeelsInCelsius +
                ", isDay=" + isDay +
                ", pressureMb=" + pressureMb +
                ", location='" + location + '\'' +
                ", weatherCondition=" + weatherCondition +
                '}';
    }
}

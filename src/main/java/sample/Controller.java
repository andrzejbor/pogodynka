package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import sample.model.Weather;
import sample.service.WeatherServiceJsonOrg;
import java.net.URL;

import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Label dateLabel;

    @FXML
    private Label cityLabel;

    @FXML
    private Label textConditionLabel;

    @FXML
    private Label temperatureLabel;

    @FXML
    private ImageView iconImageViev;

    private Weather currentWeather;

    public void initialize(URL location, ResourceBundle resource){
        WeatherServiceJsonOrg weatherServiceJsonOrg = new WeatherServiceJsonOrg("af7ebd7ff95b42469d2145621161711");
        currentWeather = weatherServiceJsonOrg.getWeatherFromUrl("http://api.apixu.com/v1/current.json","Warsaw");
        dateLabel.setText(currentWeather.getLastUpdated());

        cityLabel.setText(currentWeather.getLocation());
        temperatureLabel.setText(String.valueOf(currentWeather.getTemperatureInCelsius()));
        textConditionLabel.setText(currentWeather.getWeatherCondition().getText());

    }
}

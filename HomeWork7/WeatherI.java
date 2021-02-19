package JavaCore.HomeWork7;

import java.io.IOException;

public interface WeatherI {

    void getCurrentWeather(String cityKey) throws IOException;
    void getFiveDaysWeather(String cityKey) throws IOException;
}
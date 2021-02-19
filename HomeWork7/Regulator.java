package JavaCore.HomeWork7;

import java.io.IOException;

public class Regulator implements RegulatorI {

    WeatherI weather = new YandexWeather();

    @Override
    public void onCityInput(String city) { }

    @Override
    public void onCommandChosen(int selectedCommand) throws IOException {
        switch (selectedCommand) {
            case 1: {
                weather.getCurrentWeather(State.getInstance().getCityKey());
                break;
            }
            case 2: {
                weather.getFiveDaysWeather(State.getInstance().getCityKey());
                break;
            }
            default: {
                throw new IOException("Что-то пошло не так\n");
            }
        }
    }
}
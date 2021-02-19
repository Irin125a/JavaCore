package JavaCore.HomeWork7_2;

import java.io.IOException;

public interface IController {

    void onCityInput(String city) throws IOException;
    void onCommandChosen(int selectedCommand) throws IOException;
}

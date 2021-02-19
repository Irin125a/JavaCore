package JavaCore.HomeWork7;

import java.io.IOException;

public interface RegulatorI {

    void onCityInput(String city) throws IOException;

    void onCommandChosen(int selectedCommand) throws IOException;
}

package JavaCore.HomeWork7_2;

import java.io.IOException;

public interface ICityCodeProvider {

    void getCodeByCityName(String cityName) throws IOException;
}
package JavaCore.HomeWork7_2;

public class AppGlobalState {

    private static AppGlobalState instance;

    private String cityKey;

    public String getCityKey() {
        return cityKey;
    }

    public void setCityKey(String cityKey) {
        this.cityKey = cityKey;
    }

    public String getApiKey() {
        return "H6ldpZ8Uej2NF2cOGdMmZa5wo1wWr0vq";
    }

    private AppGlobalState() {
    }

    public static AppGlobalState getInstance() {
        if (instance == null) {
            instance = new AppGlobalState();
        }
        return instance;
    }
}
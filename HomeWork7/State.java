package JavaCore.HomeWork7;

public class State {

    private static State instance;
    private static String cityKey;

    public String getCityKey() {
        return cityKey;
    }

    private State(String cityKey) {
        State.cityKey = cityKey;
    }

    public static State getInstance() {
        if (instance == null) {
            instance = new State(cityKey);
        }
        return instance;
    }
}
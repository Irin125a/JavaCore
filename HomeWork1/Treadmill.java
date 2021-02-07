package JavaCore.HomeWork1;

public class Treadmill extends Barrier {

    private final int length;

    public Treadmill(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean moving(Actions actions) {
        System.out.println("Длина дороги " + this.length);

        actions.run();

        if (getLength() <= actions.getRun()) {
            System.out.println("Пробежал, следующая попытка");

            return true;
        } else {
            System.out.println("Не смог");

            return false;
        }
    }
}
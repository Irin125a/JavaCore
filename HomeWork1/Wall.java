package JavaCore.HomeWork1;

public class Wall extends Barrier {

    private final int height;

    public Wall(String name, int height) {
        super(name);

        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean moving(Actions actions) {
        System.out.println("Высота стены " + this.height);

        actions.jump();

        if (getHeight() <= actions.getJump()) {
            System.out.println("Прыгнул, следующая попытка");

            return true;
        } else {
            System.out.println("Не смог");

            return false;
        }
    }
}
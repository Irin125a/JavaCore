package JavaCore.HomeWork1;

public class Robot implements Actions {

    private final String name;
    private final int run;
    private final int jump;

    public Robot(String name, int distance, int jump) {
        this.name = name;
        this.run = distance;
        this.jump = jump;
    }

    @Override
    public void run() {
        System.out.println("Робот " + this.name + " пробежал " + this.getRun());
    }

    @Override
    public void jump() {
        System.out.println("Робот " + this.name + " прыгнул " + this.getJump());
    }

    @Override
    public int getRun() {
        return this.run;
    }

    @Override
    public int getJump() {
        return this.jump;
    }
}

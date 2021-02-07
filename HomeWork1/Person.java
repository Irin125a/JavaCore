package JavaCore.HomeWork1;

public class Person implements Actions {

    private final String name;
    private final int run;
    private final int jump;

    public Person(String name, int distance, int jump) {
        this.name = name;
        this.run = distance;
        this.jump = jump;
    }

    @Override
    public void run() {
        System.out.println("Человечишка " + this.name + " пробежал(а) " + this.getRun());
    }

    @Override
    public void jump() {
        System.out.println("Человечишка " + this.name + " прыгнул(а) " + this.getJump());
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

package JavaCore.HomeWork3;

public class Box<T extends Fruit> {

    private final T object;
    private final int fruitCount;

    public Box(T object, int fruitCount) {
        this.object = object;
        this.fruitCount = fruitCount;
    }

    float getWeight() {
        return fruitCount * object.getWeight();
    }

    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();

    }
}
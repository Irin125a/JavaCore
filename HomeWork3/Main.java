package JavaCore.HomeWork3;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();
        System.out.println(apple.getWeight() + " - весит 1 яблоко");
        System.out.println(orange.getWeight() + " - весит 1 апельсин");

        Box<Apple> appleBox = new Box<>(apple, 10);
        System.out.println("Всего в коробке " + appleBox.getWeight() + " грамм яблок");
        Box<Orange> orangeBox = new Box<>(orange, 9);
        System.out.println("Всего в коробке " + orangeBox.getWeight() + " грамм апельсин");

        System.out.println();
        System.out.println("Равны ли корзина с яблоками и корзина с апельсинами? - " + orangeBox.compare(appleBox));

    }
}

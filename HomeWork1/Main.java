package JavaCore.HomeWork1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = new Actions[6];

        int distance = (8);
        int height = (10);
        actions[0] = new Person("Лёха", distance, height);

        distance = (12);
        height = (8);
        actions[1] = new Person("Катериночка", distance, height);

        distance = (14);
        height = (18);
        actions[2] = new Robot("001", distance, height);

        distance = (9);
        height = (20);
        actions[3] = new Robot("008", distance, height);

        distance = (10);
        height = (20);
        actions[4] = new Cat("Легавый", distance, height);

        distance = (13);
        height = (19);
        actions[5] = new Cat("Снежка", distance, height);

        Barrier[] barriers = new Barrier[3];

        boolean isTreadmill;
        for ( int i = 0; i < barriers.length; i++ ) {
            distance = rand.nextInt(20);
            isTreadmill = rand.nextBoolean();
            if (isTreadmill) {
                barriers[i] = new Treadmill("Treadmill " + i, distance);
            } else {
                barriers[i] = new Wall("Wall " + i, distance);
            }
        }

        for ( Actions action : actions ) {
            boolean result = true;
            for ( Barrier barrier : barriers ) {

                result = barrier.moving(action);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Испытания пройдены!!!");
            } else {
                System.out.println("Стоит ещё потренироваться...");
            }
            System.out.println();
        }
    }
}
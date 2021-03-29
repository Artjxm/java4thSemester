package pr4;

import java.util.Random;

public class nameSpawner  implements Runnable {
    private String[] names = {"Arthur", "John", "Dutch", "Elijah", "Marlon", "Mads", "Ryan"};
    private Random random = new Random();

    public void run() {
        try {
            System.out.println(names[random.nextInt(names.length)]);
            Thread.sleep(random.nextInt(150) + 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("We run it, do we???");
    }
}

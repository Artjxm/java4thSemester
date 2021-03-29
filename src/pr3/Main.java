package pr3;

import java.util.Collection;
import java.util.Collections;

public class Main {
    static class thread1 extends Thread {
        public void run() {
            setSemaphore<Integer> example = new setSemaphore<>();

            example.add(5);
            example.add(10);
            example.add(12);
            example.add(-5);

            System.out.println(example);
            System.out.println(example.containsAll(Collections.singleton(5)));
            example.remove(12);
            System.out.println(example.size());
            System.out.println(example.isEmpty());
        }
    }

    static class thread2 extends Thread {
        public void run() {
            ListSync<Integer> example = new ListSync<>();
            example.add(3);
            example.add(7);
            example.add(15);
            example.add(-5);

            System.out.println("Using ListSync {" + example + "}");
            System.out.println(example.size());
            System.out.println(example.contains(7));
            example.remove(3);
            System.out.println(example.indexOf(-5));
        }
    }

    public static void main(String[] args) {
        thread1 listie = new thread1();
        listie.start();

        thread2 settie = new thread2();
        settie.start();
    }
}


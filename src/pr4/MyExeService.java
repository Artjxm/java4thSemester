package pr4;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExeService {
    private ExecutorService exeSer;
    private Random random = new Random();

    public MyExeService(int number) {
        exeSer = Executors.newFixedThreadPool(number);

        int threads = random.nextInt(15) + 1;
        System.out.println("Кол-во потоков: " + threads + " для введенных " +
                number + '\n');

        for(int i = 0; i < threads; ++i) {
            System.out.println((i + 1) + " поток");
            exeSer.execute(new nameSpawner());
        }

        exeSer.shutdown();
        System.out.println("Успешное завершение работы");
    }
}

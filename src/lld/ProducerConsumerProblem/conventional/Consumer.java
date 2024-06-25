package lld.ProducerConsumerProblem.conventional;

import java.time.Duration;
import java.util.Queue;

public class Consumer implements Runnable{

    String threadName;
    CustomBlockingQueue queue;
    public Consumer(String threadName, CustomBlockingQueue queue) {
        this.threadName = threadName;
        this.queue = queue;
    }

    public void run() {
        while(true) {

            try {
                int k = queue.poll();
                System.out.println(String.format("consumer polling the data, %s, %s", Thread.currentThread().getName(), k));
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(String.format("consumer terminating the thread, %s", Thread.currentThread().getName()));
                throw new RuntimeException(e);
            }
        }
    }


}

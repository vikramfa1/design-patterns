package lld.ProducerConsumerProblem.conventional;

import java.time.Duration;

public class Producer implements Runnable{

    String threadName;
    CustomBlockingQueue queue;

    public Producer(String threadName, CustomBlockingQueue queue) {
        this.queue = queue;
        this.threadName = threadName;
    }

    public void run() {

        for(int i=0;i<10;i++) {
                try {
                    System.out.println(String.format("producer adding tasks: %s, %s, %s", i, threadName, Thread.currentThread().getName()));
                    queue.addTask(i);
                    Thread.sleep(Duration.ofMillis(500).toMillis());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

}

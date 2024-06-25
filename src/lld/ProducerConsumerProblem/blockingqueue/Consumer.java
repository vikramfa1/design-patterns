package lld.ProducerConsumerProblem.blockingqueue;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{

    BlockingQueue<Integer> blockingDeque = null;
    String threadName;
    public Consumer(String threadName, BlockingQueue<Integer> blockingDeque) {
        this.blockingDeque = blockingDeque;
        this.threadName = threadName;
    }
    public void run() {
        while(true) {
            try {
                int k = blockingDeque.take();
                System.out.println(String.format("currConsumerThread: %s, %s, %s", threadName, Thread.currentThread().getName(), k));
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

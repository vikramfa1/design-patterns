package lld.ProducerConsumerProblem;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{

    BlockingQueue<Integer> blockingDeque = null;
    public Consumer(BlockingQueue<Integer> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }
    public void run() {
        while(true) {
            try {
                int k = blockingDeque.take();
                System.out.println(String.format("currConsumerThread: %s, %s", Thread.currentThread().getName(), k));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

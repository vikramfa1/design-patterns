package lld.ProducerConsumerProblem.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
    BlockingQueue<Integer> blockingDeque;
    String threadName;
    public Producer(String threadName, BlockingQueue<Integer> blockingDeque) {
        this.blockingDeque = blockingDeque;
        this.threadName = threadName;
    }
    public void run() {
        for(int i=0;i<10;i++) {
            int temp = i*2;
            System.out.println(String.format("currProducerThread: %s, %s, %s", threadName, Thread.currentThread().getName(), temp));
            try {
                blockingDeque.put(temp);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

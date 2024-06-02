package lld.ProducerConsumerProblem;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
    BlockingQueue<Integer> blockingDeque;
    public Producer(BlockingQueue<Integer> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }
    public void run() {
        for(int i=0;i<10;i++) {
            int temp = i*2;
            System.out.println(String.format("currProducerThread: %s, %s", Thread.currentThread().getName(), temp));
            try {
                blockingDeque.put(temp);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

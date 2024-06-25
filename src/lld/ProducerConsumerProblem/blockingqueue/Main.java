package lld.ProducerConsumerProblem.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    public static void main(String args[]) {

        BlockingQueue<Integer> blockingDeque = new ArrayBlockingQueue<>(4);

        Producer producer = new Producer("prod", blockingDeque);
        Consumer consumer1 = new Consumer("con1", blockingDeque);
        Consumer consumer2 = new Consumer("con2", blockingDeque);

        consumer1.start();
        consumer2.start();
        producer.start();
    }
}

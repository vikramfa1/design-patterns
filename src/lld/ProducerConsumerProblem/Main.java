package lld.ProducerConsumerProblem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    public static void main(String args[]) {

        BlockingQueue<Integer> blockingDeque = new ArrayBlockingQueue<>(4);

        Producer producer = new Producer(blockingDeque);
        Consumer consumer = new Consumer(blockingDeque);

        consumer.start();
        producer.start();
    }
}

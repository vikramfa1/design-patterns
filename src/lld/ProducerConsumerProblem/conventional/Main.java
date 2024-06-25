package lld.ProducerConsumerProblem.conventional;

public class Main {

    public static void main(String args[]) {
        CustomBlockingQueue queue  = new CustomBlockingQueue(5);

        Producer producer = new Producer("producer1", queue);
        Consumer consumer1 = new Consumer("con1", queue);
        Consumer consumer2 = new Consumer("con2", queue);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer1);
        Thread t3 = new Thread(consumer2);
        t1.start();
        t2.start();
        t3.start();
    }
}

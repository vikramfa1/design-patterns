package lld.ProducerConsumerProblem.conventional;

import java.util.ArrayDeque;
import java.util.Queue;

public class CustomBlockingQueue {

    Queue<Integer> queue;
    int capacity;
    public CustomBlockingQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new ArrayDeque<>(capacity);

    }

    public  int poll() throws InterruptedException {
        synchronized (this) {
            if (queue.size() == 0) {
                System.out.printf("%s consumer going into wait state..%n", Thread.currentThread().getName());
                wait();
            }
        }
        int k=0;
        synchronized (this) {
            try {
                if(queue.size()>0) k=queue.poll();
            } catch(Exception e) {
                System.out.println("exception : "+e.getMessage());
            }
            //queue.poll();
            notify();
            return k;
        }
    }

    public void addTask(int val) throws InterruptedException {
        synchronized (this) {
            if(queue.size()==capacity) {
                System.out.printf("%s producer going into wait state..%n", Thread.currentThread().getName());
                wait();
            }
            queue.add(val);
            notify();

        }
    }
}

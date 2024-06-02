package lld.TaskScheduler;

import java.util.PriorityQueue;

public class CustomMinHeap {
    public PriorityQueue<Task> priorityQueue;

    public synchronized void addTask(Task task) {
        priorityQueue.offer(task);
        notify();
    }

    public synchronized Task poll() throws InterruptedException {
        if(isEmpty()) wait();
        return priorityQueue.poll();
    }

    public synchronized boolean isEmpty() {
        return priorityQueue.isEmpty();
    }


    public void init() {
        priorityQueue = new PriorityQueue<Task>((a, b) -> (a.startTime.compareTo(b.startTime)) != 0 ? (a.startTime.compareTo(b.startTime)) : Long.compare(a.durationInHrs, b.durationInHrs));
    }

    public CustomMinHeap() {
        init();
    }
}

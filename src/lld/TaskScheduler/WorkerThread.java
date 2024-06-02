package lld.TaskScheduler;

import java.time.Duration;

public class WorkerThread implements Runnable{
    Task currentTask;
    CustomMinHeap customMinHeap;
    public WorkerThread(CustomMinHeap customMinHeap) {
        this.customMinHeap = customMinHeap;
    }
    public void run() {

        System.out.println("Thread started: "+Thread.currentThread().getName());
        while(true) {
            try {
                currentTask =customMinHeap.poll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("currentTask: "+currentTask);
            System.out.println("current Executing task: "+currentTask.taskName+","+Thread.currentThread().getName());
            currentTask.executionStatus = ExecutionStatus.INPROGRESS;
            try {
                Thread.sleep(Duration.ofSeconds(currentTask.durationInHrs).toMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Execution completed task: " + currentTask.taskName + "," + Thread.currentThread().getName());
            currentTask.executionStatus = ExecutionStatus.COMPLETED;
            if(currentTask.isRecurring) {
                try {
                    Task nextRecurringTask = currentTask.clone();
                    nextRecurringTask.executionStatus = ExecutionStatus.PENDING;
                    customMinHeap.addTask(nextRecurringTask);

                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

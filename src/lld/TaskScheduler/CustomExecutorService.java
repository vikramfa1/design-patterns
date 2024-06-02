package lld.TaskScheduler;

import java.util.ArrayList;
import java.util.List;

public class CustomExecutorService {

    CustomMinHeap customMinHeap;
    List<Thread> workerThreadList;
    List<Task> taskExecutionHistory;
    int workerThreadCount;


    public CustomExecutorService(int workerThreads) {
        this.workerThreadCount = workerThreads;
        customMinHeap = new CustomMinHeap();

        workerThreadList  = new ArrayList<>();
        for(int i=0;i<workerThreads;i++) {
            workerThreadList.add(new Thread(new WorkerThread(customMinHeap)));
        }
        for(int i=0;i<workerThreads;i++) {
            workerThreadList.get(i).start();
        }
    }

    public void addTask(Task task) {
        task.executionStatus = ExecutionStatus.PENDING;
        taskExecutionHistory.add(task);
        customMinHeap.addTask(task);
    }
}

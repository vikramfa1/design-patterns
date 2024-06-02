package lld.TaskScheduler;

public class TaskScheduler {

    CustomExecutorService customExecutorService;

    public TaskScheduler(int workers) {
        customExecutorService = new CustomExecutorService(workers);
    }

    public void scheduleTasks(Task task) {
        customExecutorService.addTask(task);

    }
}

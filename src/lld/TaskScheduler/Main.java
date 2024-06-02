package lld.TaskScheduler;

import java.time.Duration;
import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String args[]) throws InterruptedException {

        TaskScheduler taskScheduler = new TaskScheduler(5);
        Task task1 = new Task();
        task1.taskName = "1st task";
        task1.startTime= getDate(12,2,2014);
        task1.currentTimeStamp = System.currentTimeMillis();
        task1.durationInHrs = 3;
        taskScheduler.scheduleTasks(task1);

        Task task2 = new Task();
        task2.taskName = "2nd task";
        task2.startTime= getDate(12,2,2014);
        task2.currentTimeStamp = System.currentTimeMillis()+10;
        task2.durationInHrs = 3;
        taskScheduler.scheduleTasks(task2);

        Thread.sleep(Duration.ofSeconds(10).toMillis());
        Task task3 = new Task();
        task3.taskName = "3rd task";
        task3.startTime= getDate(14,2,2014);
        task3.currentTimeStamp = System.currentTimeMillis();
        task3.durationInHrs = 3;
        taskScheduler.scheduleTasks(task3);

    }

    public static Date getDate(int date, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DATE, date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        // calendar.set(2023, 0, 8, 0, 0, 0);

        return calendar.getTime();
    }
}

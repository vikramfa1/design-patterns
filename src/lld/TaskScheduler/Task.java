package lld.TaskScheduler;

import java.util.Date;

public class Task implements Cloneable {
    String taskName;
    long currentTimeStamp;
    Date startTime;
    long durationInHrs;
    boolean isRecurring;
    long recurringHrs;
    ExecutionStatus executionStatus;

    public Task clone() throws CloneNotSupportedException {
        // Assign the shallow copy to
        // new reference variable t
        Task t = (Task) super.clone();
        return t;

    }
}

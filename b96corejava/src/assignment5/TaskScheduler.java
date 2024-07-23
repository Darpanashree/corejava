package assignment5;

import java.util.Timer;
import java.util.TimerTask;

public class TaskScheduler {
    private Timer timer;

    public TaskScheduler() {
        this.timer = new Timer();
    }

    public void scheduleTask(Task task, int interval) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                task.execute();
            }
        }, 0, interval * 1000);
    }

    public void stopScheduler() {
        timer.cancel();
    }
}

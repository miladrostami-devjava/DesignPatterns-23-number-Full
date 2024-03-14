package org.example;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {
    private List<TaskPrototype> tasks;
    public ThreadPool() {
        tasks = new ArrayList<>();

    }
    public void submitTask(TaskPrototype task){
        tasks.add(task);
    }
    public void executeTasks(){
        for (TaskPrototype task: tasks) {
            Thread thread = null;
            if (task instanceof TaskPrototype) {
            thread = new Thread((Runnable) task);
                thread.start();
            }
        }
    }

}

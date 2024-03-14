package org.example;

public class Task implements Runnable,TaskPrototype{
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Task " + name + "is running on thread"
        + Thread.currentThread().getName()  );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task " + name + "is completed!!!");
    }

    @Override
    public Task clone() {
        try {
            Task clone = (Task) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
           clone.name = this.name;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

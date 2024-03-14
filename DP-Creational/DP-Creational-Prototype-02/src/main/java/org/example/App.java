package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ThreadPool pool = new ThreadPool();
Task prototypeTask = new Task("prototype task");
pool.submitTask(prototypeTask.clone());
        pool.submitTask(prototypeTask.clone());
        pool.submitTask(prototypeTask.clone());
        pool.submitTask(prototypeTask.clone());
        pool.submitTask(prototypeTask.clone());
  pool.executeTasks();
    }
}

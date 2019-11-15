import java.util.List;
import java.util.ArrayList;

/**
 * Implement a MultiExecutor
 * Given a list of Runnable tasks, when executeAll() is called, 
 * execute all the given tasks
 */

public class MultiExecutor {
    List<Thread> taskList;
    // Add any necessary member variables here

    /* 
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        this.taskList = new ArrayList<>();
        for (Runnable task : tasks) {
            Thread t = new Thread(task);
            taskList.add(t);
        }
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        // complete your code here
        for (Thread t : taskList) {
            t.start();
        }
    }
}
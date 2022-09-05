package telran.deadlock;

import telran.deadlock.tasks.Task;

public class controller {
    public static void main(String[] args) {
        Task task1 = new Task();
        Task task2 = new Task();
        task1.setOtherMonitor(task2);
        task2.setOtherMonitor(task1);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}

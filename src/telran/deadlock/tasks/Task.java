package telran.deadlock.tasks;

public class Task implements Runnable{
    Object otherMonitor;

    public Task(Object otherMonitor) {
        this.otherMonitor = otherMonitor;
    }

    public Object getOtherMonitor() {
        return otherMonitor;
    }

    public void setOtherMonitor(Object otherMonitor) {
        this.otherMonitor = otherMonitor;
    }

    public Task() {
    }

    @Override
    public void run() {
        System.out.println("thread started");
        synchronized (this){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (otherMonitor){

            }
        }
        System.out.println("thread finished");
    }
}

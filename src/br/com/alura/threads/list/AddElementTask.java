package br.com.alura.threads.list;

public class AddElementTask implements Runnable {

    private List list;
    private int threadNumber;

    public AddElementTask(List list, int threadNumber) {
        this.list = list;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            list.add("Thread " + threadNumber + " - " + i);
        }
    }
}

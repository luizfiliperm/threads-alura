package br.com.alura.threads.list;

public class PrintListTask implements Runnable {
    private List list;

    public PrintListTask(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            if(!list.isFull()){
                try {
                    System.out.println("Waiting, list is empty");
                    list.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + " - " + list.getElement(i));
            }
        }
    }
}

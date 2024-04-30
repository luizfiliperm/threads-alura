package br.com.alura.threads.bathroom;

public class CleanerTask implements Runnable {
    private Bathroom bathroom;

    public CleanerTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        while(true){
            bathroom.clean();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

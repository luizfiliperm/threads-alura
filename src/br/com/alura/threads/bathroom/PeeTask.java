package br.com.alura.threads.bathroom;

public class PeeTask implements Runnable {

    private Bathroom bathroom;

    public PeeTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.pee();
    }
}

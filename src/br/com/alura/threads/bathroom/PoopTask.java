package br.com.alura.threads.bathroom;

public class PoopTask implements Runnable {

    private Bathroom bathroom;

    public PoopTask(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    @Override
    public void run() {
        bathroom.poop();
    }
}

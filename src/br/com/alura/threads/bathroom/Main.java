package br.com.alura.threads.bathroom;

public class Main {
    public static void main(String[] args){

        Bathroom bathroom = new Bathroom();

        Thread cleaner = new Thread(new CleanerTask(bathroom), "Cleaner");
        cleaner.setDaemon(true);
        Thread guest1 = new Thread(new PeeTask(bathroom), "João");
        Thread guest2 = new Thread(new PoopTask(bathroom), "Pedro");
        Thread guest3 = new Thread(new PeeTask(bathroom), "Maria");
        Thread guest4 = new Thread(new PoopTask(bathroom), "Ana");

        guest1.start();
        guest2.start();
        cleaner.start();
        cleaner.setPriority(Thread.MAX_PRIORITY);
        guest3.start();
        guest4.start();
    }
}

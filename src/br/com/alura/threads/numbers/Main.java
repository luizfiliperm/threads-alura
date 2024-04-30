package br.com.alura.threads.numbers;

public class Main {
    public static void main(String[] args){

        Runnable printNumbers = new Runnable() {
            @Override
            public void run() {
                Thread currentThread = Thread.currentThread();
                long id = currentThread.getId();
                for(int i = 0; i < 1000; i++){
                    System.out.println(i + " - " + id);
                }
            }
        };

        Thread thread1 = new Thread(printNumbers);
        Thread thread2 = new Thread(printNumbers);

        thread1.start();
        thread2.start();
    }
}
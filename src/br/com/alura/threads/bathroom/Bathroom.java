package br.com.alura.threads.bathroom;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bathroom {

    private Lock lock = new ReentrantLock();

    public void pee(){
        String guestName = Thread.currentThread().getName();

        System.out.println(guestName + " knocking the door");
        lock.lock();
            System.out.println(guestName + " entering the bathroom");
            System.out.println(guestName + " doing pee");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(guestName + " flushing the toilet");
            System.out.println(guestName + " washing hands");
            System.out.println(guestName + " leaving the bathroom");
        lock.unlock();

    }

    public void poop(){
        String guestName = Thread.currentThread().getName();

        System.out.println(guestName + " knocking the door");
        lock.lock();
            System.out.println(guestName + " entering the bathroom");
            System.out.println(guestName + " doing poop");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(guestName + " flushing the toilet");
            System.out.println(guestName + " washing hands");
            System.out.println(guestName + " leaving the bathroom");
        lock.unlock();
    }
}

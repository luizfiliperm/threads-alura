package br.com.alura.threads.bathroom;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bathroom {

    private boolean isClean;

    public Bathroom() {
        this.isClean = true;
    }

    public void pee(){
        String guestName = Thread.currentThread().getName();

        System.out.println(guestName + " knocking the door");
        synchronized (this){

            System.out.println(guestName + " entering the bathroom");

            if(!isClean){
                waiting(guestName);
                pee();
                return;
            }

            System.out.println(guestName + " doing pee");

            wait(5000);
            isClean = false;

            System.out.println(guestName + " flushing the toilet");
            System.out.println(guestName + " washing hands");
            System.out.println(guestName + " leaving the bathroom");
        }

    }

    private static void wait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void poop(){
        String guestName = Thread.currentThread().getName();

        System.out.println(guestName + " knocking the door");
        synchronized (this){
            System.out.println(guestName + " entering the bathroom");
            if(!isClean){
                waiting(guestName);
                poop();
                return;
            }

            System.out.println(guestName + " doing poop");

            wait(10000);
            isClean = false;

            System.out.println(guestName + " flushing the toilet");
            System.out.println(guestName + " washing hands");
            System.out.println(guestName + " leaving the bathroom");
        }
    }

    public void clean() {
        String guestName = Thread.currentThread().getName();

        System.out.println(guestName + " knocking the door");
        synchronized (this) {
            System.out.println(guestName + " entering the bathroom");

            if(isClean){
                System.out.println(guestName + " leaving the bathroom - the bathroom is already clean");
                return;
            }
            System.out.println(guestName + " cleaning the bathroom");

            wait(12000);
            this.isClean = true;

            this.notifyAll();

            System.out.println(guestName + " leaving the bathroom");
        }
    }

    private void waiting(String guestName) {
        System.out.println(guestName + " leaving the bathroom - dirty bathroom");
        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

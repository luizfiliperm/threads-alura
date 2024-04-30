package br.com.alura.threads.bathroom;

public class Bathroom {

    public void pee(){
        String guestName = Thread.currentThread().getName();

        System.out.println(guestName + " knocking the door");
        synchronized(this) {
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
        }



    }

    public void poop(){
        String guestName = Thread.currentThread().getName();

        System.out.println(guestName + " knocking the door");
        synchronized (this){
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
        }
    }
}

package br.com.alura.threads.search;

public class Main {
    public static void main(String[] args){
        String name = "da";

        Thread signaturesThread1 = new Thread(new TextSearchTask("resources/signatures.txt", name));
        Thread signaturesThread2 = new Thread(new TextSearchTask("resources/signatures2.txt", name));
        Thread authorsThread = new Thread(new TextSearchTask("resources/authors.txt", name));

        signaturesThread1.start();
        signaturesThread2.start();
        authorsThread.start();
    }
}
package br.com.alura.threads.deadlock;

public class Main {

    public static void main(String[] args) {

        TransactionManager tx = new TransactionManager();
        ConnectionPool pool = new ConnectionPool();

        new Thread(new TaskAcessBank(pool, tx)).start();
        new Thread(new TaskAccessProcedure(pool, tx)).start();
    }
}
